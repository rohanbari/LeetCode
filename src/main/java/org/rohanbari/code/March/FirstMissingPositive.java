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

/**
 * 41. First Missing Positive
 */
public class FirstMissingPositive {

    /**
     * Finds the lowest missing positive integer from an array.
     * 
     * @param nums The array
     * @return The lowest missing postiive integer
     */
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        boolean[] seen = new boolean[len + 1];

        for (int num : nums) {
            if (num > 0 && num <= len) {
                seen[num] = true;
            }
        }

        for (int i = 1; i <= len; i++) {
            if (!seen[i]) {
                return i;
            }
        }

        return len + 1;
    }
}
