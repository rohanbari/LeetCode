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
import java.util.HashSet;
import java.util.Set;

/**
 * 2540. Minimum Common Value
 */
class MinCommonValue {

    /**
     * Gets the minimum common value from two arrays.
     * 
     * @param nums1 Array 1
     * @param nums2 Array 2
     * @return Minimum element common to both arrays
     */
    public int getCommon(int[] nums1, int[] nums2) {
        enum Method {
            OPT1, OPT2
        }
        Method method = Method.OPT1;

        switch (method) {
            case OPT1:
                Set<Integer> set = new HashSet<>();

                for (int num : nums1)
                    set.add(num);

                for (int num : nums2)
                    if (set.contains(num))
                        return num;
                break;

            case OPT2:
                for (int num : nums2)
                    if (Arrays.binarySearch(nums1, num) >= 0)
                        return num;
            default:
                break;
        }

        return -1;
    }
}
