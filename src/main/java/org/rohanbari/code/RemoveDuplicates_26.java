/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

class RemoveDuplicates_26 {

    /**
     * Removes the duplicates from an array and returns the size of the newly
     * compressed array.
     *
     * @param nums The array to be compressed
     * @return Number of unique elements
     */
    public static int removeDuplicates(int[] nums) {
        int n = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[n] = nums[i];
                n++;
            }
        }

        return n;
    }
}
