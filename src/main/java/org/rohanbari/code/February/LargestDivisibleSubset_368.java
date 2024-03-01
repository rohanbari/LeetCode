/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class LargestDivisibleSubset_368 {

    public static List<Integer> largestDivisibleSubset(int[] nums) {
        // Sorting the array in ascending order to make the latter element
        // divisible by the former ones
        Arrays.sort(nums);

        int[] largest = new int[nums.length];
        int[] prev = new int[nums.length];

        int max = 0;
        int idx = -1;

        for (int i = 0; i < nums.length; i++) {
            largest[i] = 1;
            prev[i] = -1;

            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 && largest[j] + 1 > largest[i]) {
                    largest[i] = largest[j] + 1;
                    prev[i] = j;
                }
            }

            if (largest[i] > max) {
                max = largest[i];
                idx = i;
            }
        }

        List<Integer> list = new ArrayList<>();

        while (idx != -1) {
            list.add(nums[idx]);
            idx = prev[idx];
        }

        return list;
    }
}
