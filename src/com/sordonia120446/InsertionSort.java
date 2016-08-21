package com.sordonia120446;

/**
 * Created by SamO on 8/20/16.
 *
 * Implementation of the insertionsort algorithm.
 *
 * Wiki page:  https://en.wikipedia.org/wiki/Insertion_sort
 */
public class InsertionSort {
    private int[] mArray;

    public InsertionSort(int[] array) {
        mArray = array;
    } // end constructor

    public int[] insertionSort() {
        /*
        Not the best sorting algorithm, but it works well on arrays of length 8~20.
        Also works well on partially sorted arrays compared to other sorting algorithms.
        */
        for (int i = 1; i < (mArray.length); i++) {
            int j = i;
            while (j > 0) {
                if (mArray[j - 1] > mArray[j]) {
                    mArray = swap(mArray,j,j-1);
                } // end if
                j--;
            } // end while
        } // end for
        return mArray;
    } // end method insertionSort

    private int[] swap(int[] arr, int ind1, int ind2) {
        // Swaps two elements in int array arr, given indices ind1 and ind2.
        int tmp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = tmp;
        return arr;
    } // end helper method swap
}
