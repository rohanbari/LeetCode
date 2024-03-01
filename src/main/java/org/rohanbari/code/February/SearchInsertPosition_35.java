/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

import java.util.Arrays;

class SearchInsertPosition_35 {
    
    public static int searchInsert(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        if (idx <= -1)
            return Math.abs(idx) - 1;

        return idx;
    }
}
