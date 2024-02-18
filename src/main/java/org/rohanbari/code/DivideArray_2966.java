/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DivideArray_2966 {

    public static List<List<Integer>> divideArray(int[] nums, int k) {
        // If the size is not completely divisible by three, then the triad
        // cannot be prepared fully
        int size = nums.length;
        if (size % 3 != 0) {
            return new ArrayList<>();
        }

        // Sorting the array to ease comparison
        Arrays.sort(nums);

        // This container will be used to store the array of arrays
        List<List<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < size; i += 3) {
            // Measuring the difference criteria
            if (i + 2 < size && nums[i + 2] - nums[i] <= k) {
                // Putting the triad at once
                lists.add(Arrays.asList(nums[i], nums[i + 1], nums[i + 2]));
            } else {
                // In case the difference between any two element is not less
                // than or equal to k, an empty list is returned
                return new ArrayList<>();
            }
        }

        // After a complete execution, this list will be returned.
        // It guarantees at least one triad.
        return lists;
    }

    public static int[][] divideArraySubmission(int[] nums, int k) {
        // If the size is not completely divisible by three, then the triad
        // cannot be prepared fully
        int size = nums.length;
        if (size % 3 != 0) {
            return new int[][]{};
        }

        // Sorting the array to ease comparison
        Arrays.sort(nums);

        // This 2-dimensional array will be used to store the array of arrays
        int[][] result = new int[0][0];

        for (int i = 0; i + 2 < size; i++) {
            if (i % 3 == 0) {
                // Measuring the difference criteria
                if (nums[i + 2] - nums[i] <= k) {
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] =
                            new int[]{nums[i], nums[i + 1], nums[i + 2]};
                } else {
                    // In case the difference between any two element is not less
                    // than or equal to k, an empty list is returned
                    return new int[0][0];
                }
            }
        }

        // After a complete execution, this list will be returned.
        // It guarantees at least one triad.
        return result;
    }
}
