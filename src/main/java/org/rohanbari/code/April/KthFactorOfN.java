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

import java.util.ArrayList;
import java.util.List;

/**
 * 1492. The kth Factor of n
 */
class KthFactorOfN {

    /**
     * Returns the kth factor of N.
     * 
     * @param n The number
     * @param k 1-indexed number
     * @return kth factor of n
     */
    public int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }

        return factors.size() <= k - 1 ? -1 : factors.get(k - 1);
    }
}
