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
 * 1137. N-th Tribonacci Number
 */
class NthTribonacci {

    /**
     * Finds the nth Tribonacci term.
     * 
     * @param n The required term
     * @return Value in that term
     */
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;

        int[] seq = new int[38];

        seq[0] = 0;
        seq[1] = seq[2] = 1;

        for (int i = 3; i <= n; i++) {
            seq[i] = seq[i - 1] + seq[i - 2] + seq[i - 3];
            System.out.println(seq[i]);
        }

        return seq[n];
    }
}
