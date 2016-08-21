package com.sordonia120446;

/**
 * Created by SamO on 8/19/16.
 *
 * Implementation of the quicksort algorithm.
 *
 * Wiki page:  https://en.wikipedia.org/wiki/Quicksort
 */
public class QuickSort {
    private int[] mArray;
    private int arrLength;

    public QuickSort(int[] array) {
        mArray = array;
        arrLength = mArray.length;
    } // end constructor

    public int[] getArray() {
        return mArray;
    }

    public int[] quickSort() {
        qSort(0,arrLength - 1);
        return mArray;
    } // end method quickSort

    private void qSort(int lo, int hi) {
        /*
        Splits up the array to be sorted by a partition index.  The sort begins from the last element
        and divide-and-conquers the sort into smaller sub-arrays.
        */
        if ( (hi > lo) ) {
            int pivotIndex = lomutoPartition(lo, hi);
            qSort(lo, pivotIndex - 1 );
            qSort(pivotIndex + 1, hi );
        }

    } // end method qSort

    private int lomutoPartition(int lo, int hi) {
        /*
        Implements Lomuto's simplified version of the quicksort partition.
        The pivot element starts at the far end of the array/sub-array,
        and scans across swapping with any element that's less than it.
        The cntr index var starts at the beginning of the array and increments with each swap.
        Since the cntr index ends at the highest/second-highest element in the array, the last line
        swaps that element at cntr index with the pivot element (which could be the same btw).
        */
        int pivotElement = mArray[hi];
        int cntr = lo;
        for (int i = lo; i < hi; i++) {
            if (mArray[i] <= pivotElement) {
                mArray = swap(mArray, cntr, i);
                cntr++;
            } //end if
        } //end for
        mArray = swap( mArray, cntr, hi);
        return cntr;
    } // end method partition

    private int[] swap(int[] arr, int ind1, int ind2) {
        /*
        Swaps two elements in int[] array arr, given indices ind1 and ind2.
        Returns updated array with swapped elements.
        */
        int tmp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = tmp;
        return arr;
    } // end helper method swap

} //end class QuickSort
