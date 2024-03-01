/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

class FirstPalindrome_2108 {

    public static String firstPalindrome(String[] words) {
        for (String word : words)
            if (word.contentEquals(new StringBuilder(word).reverse()))
                return word;

        return "";
    }
}
