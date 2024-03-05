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
 * 1750. Minimum Length of String After Deleting Similar Ends
 */
class StringAfterDeletingEqualEnds {

    /**
     * Finds the minimum length of a substring that contains all unique characters.
     * 
     * @param s The string to be tested
     * @return Minimum length of the substring
     */
    public int minimumLength(String s) {
        // Specific testcase
        if (s.length() == 1)
            return 1;

        int left = 0;
        int right = s.length() - 1;

        // To save time
        char[] chars = s.toCharArray();

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                break;

            char ch = s.charAt(left);

            // Incrementing the beginning pointer of the string
            while (left <= right && chars[left] == ch)
                left++;

            // Reducing the endpoint of the string
            while (left <= right && chars[right] == ch)
                right--;
        }

        // The end of the string minus the beginning and plus one to remove the
        // zero-index calculation
        return right - left + 1;
    }
}
