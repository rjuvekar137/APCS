package com.richa;

public class Numbers {

    int[] numbers = null;

    public int[] getNumbers() {
        return numbers;
    }

    public void addNumber(int num) {

        if ( numbers == null ) {
            // if nothing in array, create one spot
            numbers = new int[1];
        } else {
            // else make new array with one more spot
            int[] newNumbers = new int[numbers.length+1];
            for (int i=0; i<numbers.length; i++) {
                newNumbers[i] = numbers[i]; // copy over
            }
            numbers = newNumbers; // replace old array with new one
        }
        numbers[numbers.length-1] = num; // add to the end
    }

    void printArray(int[] arr) {
        if ( arr == null ) {
            System.out.println("Nothing to show. Please enter some numbers.");
            return;
        }
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    int[] getNumbersCopy() {
        if ( numbers == null ) {
            return null;
        }
        int[] numCopy = new int[numbers.length];
        for (int i=0; i<numbers.length; i++) {
            numCopy[i] = numbers[i];
        }
        return numCopy;
    }

    public void printQuickSorted() {
        int[] numCopy = getNumbersCopy();
        if (numCopy ==  null) {
            System.out.println("Nothing to show. Please enter some numbers.");
            return;
        }
        printArray(numCopy);
        QuickSort.sort(numCopy, 0, numCopy.length-1);
        printArray(numCopy);
    }
}

