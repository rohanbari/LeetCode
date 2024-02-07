/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

class RemoveElement_3247 {

//    public static void main(String[] args) {
//        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
//        int val = 2;
//
//        // Expected outcome
//        int[] expectedNums = {0, 1, 3, 0, 4};
//
//        // Execution
//        int k = removeElement(nums, val);
//
//        // Assertion 1
//        assert k == expectedNums.length;
//
//        sort(nums, 0, k);
//        for (int i = 0; i < expectedNums.length; i++)
//            // Assertion 2
//            assert nums[i] == expectedNums[i];
//    }

    private static int removeElement(int[] nums, int val) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        return idx;
    }
}
