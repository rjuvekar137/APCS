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

    public void printMergeSortedArray() {
        if ( numbers == null ) {
            System.out.println("There are no numbers to sort and print.");
            return;
        }
        MergeSort.sort(numbers, 0, numbers.length-1);
        MergeSort.printArray(numbers);
    }

    public int searchNumber(int num) {
        if ( numbers == null ) {
            return -1;
        }
        MergeSort.sort(numbers, 0, numbers.length-1);
        return MergeSort.binarySearch(numbers, 0, numbers.length-1, num);
    }

}
