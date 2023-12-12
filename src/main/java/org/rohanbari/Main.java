/*
 * Copyright (c) 2023 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // Test cases
        String out1 = process("6777133339");
        String out2 = process("2300019");
        String out3 = process("42352338");

        // Output of test cases
        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
    }

    /**
     * The 3-same-digit processor.
     *
     * @param num The number to be tested on
     * @return Maximum 3-same-digit
     */
    public static String process(final String num) {
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