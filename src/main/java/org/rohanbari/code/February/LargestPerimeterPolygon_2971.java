/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

import java.util.Arrays;

class LargestPerimeterPolygon_2971 {

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

//        if (nums.length == 3) {
//            if (nums[0] + nums[1] <= nums[2])
//                return -1;
//            else
//                return nums[0] + nums[1] + nums[2];
//        }

        long sum = 0;
        for (int num : nums)
            sum += num;

        for (int i = nums.length - 1; i >= 2; i--) {
            sum -= nums[i];
            if (nums[i] < sum)
                return sum + nums[i];
        }

        return -1;
    }
}
