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
 * 2485. Find the Pivot Integer
 */
class PivotInteger {

    /**
     * Finds the index where sum(1->x) == sum(x->n).
     * 
     * @param n The final limit
     * @return Equal pivot point
     */
    public int pivotInteger(int n) {
        int sumLeft = n * (n + 1) / 2;
        int sumRight = 0;

        for (int i = 1; i <= n; i++) {
            sumRight += i;
            if (sumRight == (sumLeft - sumRight + i)) {
                return i;
            }
        }

        return -1;
    }
}
