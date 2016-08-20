package com.sordonia120446;

/**
 * Created by SamO on 8/19/16.
 *
 * Implementation of the binary search algorithm on an ascendingly sorted array of ints.
 */
public class BinarySearch {
    private int[] mArray;
    private int mTarget;
    private int mLeft;
    private int mRight;
    private int mMiddle;

    public BinarySearch(int[] array, int target) {
        mArray = array;
        mTarget = target;
        mLeft = 0;
        mRight = mArray.length - 1;
    } // end constructor

    public int binarySearch() {
        // Returns the index of the target in the sorted array.
        while (mLeft <= mRight) {
            mMiddle = Math.floorDiv(mRight + mLeft,2);
            if (mArray[mMiddle] < mTarget) {
                System.out.println(mMiddle);
                mLeft = mMiddle + 1;
            } else if (mArray[mMiddle] > mTarget) {
                mRight = mMiddle - 1;
            } else if (mArray[mMiddle] == mTarget) {
                System.out.println("Found the index!");
                return mMiddle;
            }
        } //end while loop
        return -1;
    } // end method binarySearch


}
