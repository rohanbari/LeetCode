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

import java.util.HashMap;
import java.util.Map;

/**
 * 992. Subarrays with K Different Integers
 */
class SubarraysWithKInts {

    /**
     * Finds subarrays with at most k frequency integers.
     * 
     * @param nums The array
     * @param k    The max value of frequency
     * @return Number of subarrays
     */
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            while (map.size() > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0)
                    map.remove(nums[i]);
                i++;
            }

            maxLen += j - i + 1;
        }

        return maxLen;
    }

    /**
     * Finds the subarrays with exactly K different integers.
     * 
     * @param nums The array
     * @param k    The integer
     * @return No. of subarrays
     */
    public int subarraysWithKDistinct(int[] nums, int k) {
        return maxSubarrayLength(nums, k) - maxSubarrayLength(nums, k - 1);
    }
}
