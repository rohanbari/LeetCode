/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

class RearrangeArrayBySign_2149 {

    public static int[] rearrangeArray(int[] nums) {
        int[] positiveNums = new int[nums.length / 2];
        int[] negativeNums = new int[nums.length / 2];

        int countX = 0;
        int countY = 0;

        for (int num : nums) {
            if (num > 0)
                positiveNums[countX++] = num;
            else
                negativeNums[countY++] = num;
        }

        int count = 0;
        int idx = 0;
        while (count < nums.length) {
            nums[count++] = positiveNums[idx];
            nums[count++] = negativeNums[idx];
            idx++;
        }

        return nums;
    }
}
