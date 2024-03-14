/*
 Copyright 2024 Rohan Bari <rohanbari@outlook.com>

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

      https://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.rohanbari.code.March;

import java.util.Arrays;

/**
 * 4. Median of Two Sorted Arrays
 */
class SortedArrayMedian {

    /**
     * Returns the median of concatenation of two arrays.
     * 
     * @param nums1 First array
     * @param nums2 Second array
     * @return Median of both arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int newLen = m + n;

        int[] nums = new int[m + n];

        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, n);

        Arrays.sort(nums);

        double median = (newLen % 2 == 0) ? ((nums[newLen / 2] +
                nums[newLen / 2 - 1])) / 2 : (nums[newLen / 2]);
        return median;
    }
}
