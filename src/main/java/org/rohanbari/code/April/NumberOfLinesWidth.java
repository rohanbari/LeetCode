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
 * 806. Number of Lines To Write String
 */
class NumberOfLinesWidth {

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int width = 0;

        for (int i = 0; i < s.length(); i++) {
            int currChar = s.charAt(i) - 'a';
            width += widths[currChar];

            if (width > 100) {
                lines++;
                width = widths[currChar];
            }
        }

        return new int[] { lines, width };
    }
}
