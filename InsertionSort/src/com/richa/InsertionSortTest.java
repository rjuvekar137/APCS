package com.richa;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : rjuvekar
 * @created : 3/3/21, Wednesday
 **/
class InsertionSortTest {

    @org.junit.jupiter.api.Test
    void insertionSort() {

        int[] unsorted = {4, -1, 0, 13, 8, 5};
        System.out.print("Unsorted: ");
        for ( int i=0; i<unsorted.length; i++) {
            System.out.print(unsorted[i] + " ");
        }
        System.out.println();
        InsertionSort test = new InsertionSort(unsorted);
        int[] sorted = test.insertionSort();
        System.out.print("Sorted: ");
        for ( int i=0; i<sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
        System.out.println();
    }
}