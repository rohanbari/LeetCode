package org.rohanbari.code.March;

import java.util.Arrays;

class BagTokens {

    /**
     * Return the maximum possible score you can achieve after playing any
     * number of tokens.
     * 
     * Basically, buying with the cheapest and selling at the highest.
     * 
     * @param tokens Tokens
     * @param power  Power
     * @return Max score
     */
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int score = 0;
        int points = 0;

        for (int i = 0, j = tokens.length - 1; i <= j;) {
            if (power >= tokens[i]) {
                power -= tokens[i++];
                score = Math.max(score, ++points);
            } else if (points > 0) {
                points--;
                power += tokens[j--];
            } else {
                break;
            }
        }

        return score;
    }
}
