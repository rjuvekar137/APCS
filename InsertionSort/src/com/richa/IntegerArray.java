package com.richa;

/**
 * @author : rjuvekar
 * @created : 3/3/21, Wednesday
 **/
public class IntegerArray {

    private int[] array = null;

    public int[] getArray() {
        return array;
    }

    public int getCount() {
        if ( array == null ) {
            return 0;
        }
        return array.length;
    }

    public void add(int num) {
        if (array == null) {
            array = new int[1]; // add one spot to array
        } else {
            // add one more spot to the array and copy over
            int[] array2 = new int[array.length+1];
            for (int i=0; i<array.length; i++) {
                array2[i] = array[i];
            }
            array = array2; // store new array
        }
        array[array.length-1] = num; // add the number to end of array
    }

    public void add(String nums) {
        //TODO
    }

    public void resetAll() {
        array = null; // remove the array
    }

    public void printAll() {

        if ( array == null ) {
            System.out.println("There are no numbers in the list");
        } else {
            for (int i = 0; i < getCount(); i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public void printStats() {
        if ( array == null ) {
            System.out.println("There are no numbers in the list");
        } else {
            System.out.format("Mean:     %.2f%n",getMean());
            System.out.format("Median:   %d%n",getMedian());
            System.out.format("Mode:     ");
            int[] mode = getMode();
            if ( mode == null || mode.length == 0 ) {
                System.out.println("None");
            } else {
                for (int i=0; i<mode.length; i++) {
                    System.out.print(mode[i]+" ");
                }
                System.out.println();
            }
            System.out.format("Std. Dev: %.2f%n",getStandardDeviation());
        }
    }

    private double getMean() {
        double mean = 0;
        for (int i=0; i<getCount(); i++) {
            mean += array[i]; // add up numbers
        }
        mean = mean/getCount(); // divide by count
        return mean; //TODO
    }

    private int getMedian() {
        if ( getCount() == 0 ) {
            return 0;
        } else if ( getCount() == 1 ) {
            return array[0];
        }
        int median = 0;
        InsertionSort insertionSort = new InsertionSort(array);
        int[] sorted = insertionSort.insertionSort();
        if (getCount() % 2 == 1) { //odd count
            median = array[getCount()/2];
        } else {
            median = (array[getCount()/2-1] + array[getCount()/2])/2;
        }
        return median;
    }

    private int[] getMode() {
        return null; //TODO
    }

    private double getStandardDeviation() {
        return 0; //TODO
    }
}
