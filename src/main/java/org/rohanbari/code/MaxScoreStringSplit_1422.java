/*
 * Copyright (c) 2023-2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

/**
 * 1422. Maximum Score After Splitting a String
 */
class MaxScoreStringSplit_1422 {

    /**
     * Evaluates the max score based on:
     * number of zeros on the left-side string + number of ones on the
     * right-side string.
     *
     * @param s String to be tested
     * @return Required maximum score
     */
    public static int maxScore(String s) {
        int maxScore = 0;

        int leftZeros = 0;
        int rightOnes = (int) s.chars().filter(ch -> ch == '1').count();

        for (int i = 0; i < s.length() - 1; i++) {
            leftZeros += s.charAt(i) == '0' ? 1 : 0;
            rightOnes -= s.charAt(i) == '1' ? 1 : 0;

            maxScore = Math.max(maxScore, leftZeros + rightOnes);
        }

        return maxScore;
    }
}