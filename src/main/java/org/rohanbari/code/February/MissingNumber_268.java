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

package org.rohanbari.code.February;

class MissingNumber_268 {

    /**
     * Finds the only missing number in an array in O(1).
     * 
     * @param nums The array
     * @return The missing number
     */
    public static int missingNumber(int[] nums) {
        int sumArray = nums.length * (nums.length + 1) / 2;

        for (int num : nums)
            sumArray -= num;

        return sumArray;
    }
}
