/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

class PalindromeSubstringCount_647 {
    private static int counter = 0;

    public static int countSubstrings(String s) {
        int length = s.length();

        // If it has only one
        if (length == 1)
            return 0;

        for (int i = 0; i < length; i++) {
            expandCenter(s, i, i);
            expandCenter(s, i, i + 1);
        }

        return counter;
    }

    private static void expandCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            counter++;
        }
    }
}
