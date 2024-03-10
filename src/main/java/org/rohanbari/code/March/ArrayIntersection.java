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
 * 349. Intersection of Two Arrays
 */
class ArrayIntersection {

    /**
     * Finds the set of common elements in two arrays.
     * 
     * @param nums1 First array
     * @param nums2 Second array
     * @return Set of intersection
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // To allow the binary search to do its job efficiently
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // To store unique intersection values only
        Set<Integer> set = new HashSet<>();

        // Searching for each element in common
        for (int num : nums1)
            if (Arrays.binarySearch(nums2, num) >= 0)
                set.add(num);

        // Converting set into a fundamental array
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
