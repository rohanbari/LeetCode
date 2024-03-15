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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 2164. Sort Even and Odd Indices Independently
 */
class SortEvenOdd {

    /**
     * Sorts even numbered array elements in ascending and the other in
     * descending order.
     * 
     * @param nums The original array
     * @return The modified array
     */
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        // Filling up each container
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                even.add(nums[i]);
            else
                odd.add(nums[i]);
        }

        // Sorting the even numbers in ascending order
        Collections.sort(even);
        // Sorting the odd numbers in descending order
        Collections.sort(odd);
        Collections.reverse(odd);

        int it = 0;
        int jt = 0;

        for (int i = 0; i < nums.length; i++)
            if (i % 2 == 0)
                nums[i] = even.get(it++);
            else
                nums[i] = odd.get(jt++);

        return nums;
    }
}
