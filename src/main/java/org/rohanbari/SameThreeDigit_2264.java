/*
 * Copyright (c) 2023-2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 2264. Largest 3-Same-Digit Number in String
 */
public class SameThreeDigit_2264 {

    /**
     * The 3-same-digit processor.
     *
     * @param num The number to be tested on
     * @return Maximum 3-same-digit
     */
    private static String process(final String num) {
        String[] subStrings = new String[]{
                "000", "111", "222", "333", "444",
                "555", "666", "777", "888", "999"
        };

        ArrayList<Integer> list = new ArrayList<>();

        for (final var str : subStrings) {
            if (num.contains(str)) {
                list.add(Integer.valueOf(str));
            }
        }

        // Specific case for an empty list
        if (list.isEmpty()) {
            return "";
        }

        int max = Collections.max(list);

        // Specific case for zeroes
        if (max == 0) {
            return "000";
        }

        return String.valueOf(max);
    }
}
