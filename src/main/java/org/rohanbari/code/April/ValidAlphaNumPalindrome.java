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
 * 125. Valid Palindrome
 */
public class ValidAlphaNumPalindrome {

    /**
     * Returns true if the alphanumeric-only characters are in palindrome order.
     * 
     * @param s The string
     * @return Is palindrome
     */
    public boolean isPalindrome(String s) {
        StringBuilder processed = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch) || Character.isDigit(ch)) {
                processed.append(Character.toLowerCase(ch));
            }
        }

        return processed.toString().equals(processed.reverse().toString());
    }
}
