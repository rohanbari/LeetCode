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

class PowerOfTwo_231 {
    public static boolean isPowerOfTwo_1(int n) {
        return (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwo_MyApproach(int n) {
        if (n <= 0)
            return false;

        double log2num = Math.log(n) / Math.log(2);
        return Math.abs(log2num - (int) log2num) < 0.00000000001;
    }
}
