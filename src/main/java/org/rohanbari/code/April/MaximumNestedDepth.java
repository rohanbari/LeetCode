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

package org.rohanbari.code.April;

/**
 * 1614. Maximum Nesting Depth of the Parentheses
 */
public class MaximumNestedDepth {

    /**
     * Returns nesting depth of a string.
     * 
     * @param s The string
     * @return Maximum nesting depth
     */
    public int maxDepth(String s) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter++;
            } else if (s.charAt(i) == ')') {
                counter--;
            }

            maxCounter = Math.max(maxCounter, counter);
        }

        return maxCounter;
    }
}
