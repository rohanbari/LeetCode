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

import java.util.Arrays;

/**
 * 205. Isomorphic Strings
 */
class IsomorphicStrings {

    /**
     * If String1 maps to String2 in accordance of letters, then returns true.
     * 
     * @param s String1
     * @param t String2
     * @return Is isomorphic?
     */
    public boolean isIsomorphic(String s, String t) {
        int[] key1 = new int[256];
        int[] key2 = new int[256];

        Arrays.fill(key1, -1);
        Arrays.fill(key2, -1);

        for (int i = 0; i < s.length(); i++) {
            if (key1[s.charAt(i)] != key2[t.charAt(i)])
                return false;

            key1[s.charAt(i)] = key2[t.charAt(i)] = i;
        }

        return true;
    }
}
