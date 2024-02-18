/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.HashMap;
import java.util.Map;

class TwoSum_1 {

    /**
     * This function returns an array of an integer pair containing the indices
     * of array elements that sums up to the target value.
     *
     * @param nums   The array to be tested on
     * @param target The desired result
     * @return The array of two-indices pairs
     */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i };
            } else {
                map.put(target - nums[i], i);
            }
        }

        return nums;
    }
}
