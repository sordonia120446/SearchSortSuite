package com.sordonia120446;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myInts = {1,2,3,4,5};
        int[] myInts2 = {3,2,12,7,5,10,17,4,16,18,225,0,-17};
        int target = 1;

        // Binary search test
        BinarySearch bs = new BinarySearch(myInts,target);
        System.out.println("Binary search test...");
        System.out.println(bs.binarySearch());
        System.out.println("Done!\n\n");

        // Quicksort test
        QuickSort qs = new QuickSort(myInts2);
        int[] sortedArrByQS = qs.quickSort();
        System.out.println("\n\nQuicksort test...");
        for (int i:sortedArrByQS) {
            System.out.println(i);
        }

        // Insertionsort test
        InsertionSort is = new InsertionSort(myInts2);
        int[] sortedArrByIS = is.insertionSort();
        System.out.println("\n\nInsertionsort test...");
        for (int i:sortedArrByIS) {
            System.out.println(i);
        }
    }
}
