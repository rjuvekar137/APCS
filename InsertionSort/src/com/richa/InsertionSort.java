package com.richa;

/**
 * @author : rjuvekar
 * @created : 3/3/21, Wednesday
 **/
/* A class that sorts an array of ints from smallest to largest using insertion sort */

public class InsertionSort{
    private int[] unsorted = null;
    private int[] sorted = null;

    //constructor
    public InsertionSort(int[] arr)
    {
        unsorted = arr;
    }

    //Sort array from smallest to largest using insertion sort
    //Precondition: unsorted is an array of ints
    public int[] insertionSort()
    {
        if ( unsorted == null || unsorted.length <= 1 ) {
            sorted = unsorted; // nothing to do
        } else {
            sorted = new int[unsorted.length];
            sorted[0] = unsorted[0];
            for (int i = 1; i < unsorted.length; i++) {
                sorted[i] = unsorted[i];
                for (int j = 0; j < i; j++) {
                    if ( unsorted[i] < sorted[j] ) { // insert here
                        // move by 1
                        for (int k = i-1; k >= j; k-- ) {
                            sorted[k+1] = sorted[k];
                        }
                        sorted[j] = unsorted[i];
                        break; // insert done
                    }
                }
            }
        }
        return sorted;
    }
}

