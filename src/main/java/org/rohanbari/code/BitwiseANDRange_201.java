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

package org.rohanbari.code;

class BitwiseANDRange_201 {

    public static int rangeBitwiseAnd(int left, int right) {
        // Since bitwise-AND of zero to any number is zero
        if (left == 0)
            return 0;

        // Finding the lowest common denominator
        while (right > left)
            right &= right - 1;

        return right & left;
    }
}
