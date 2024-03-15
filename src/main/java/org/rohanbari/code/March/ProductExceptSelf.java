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
 * 238. Product Except Self
 */
class ProductExceptSelf {

    /**
     * Returns an array with the product of all terms except the term iterating
     * through itself.
     * 
     * @param nums The array whose product is to be found
     * @return Product array
     */
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        int prod = 1;

        for (int i = 0; i < len; i++) {
            res[i] = prod;
            prod *= nums[i];
        }

        prod = 1;
        for (int i = len - 1; i >= 0; i--) {
            res[i] *= prod;
            prod *= nums[i];
        }

        return res;
    }
}
