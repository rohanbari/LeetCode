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
