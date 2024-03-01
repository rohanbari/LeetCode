/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

class NumbersWithEvenNumbers_1295 {

    public static int numbersWithEvenDigits(int[] array) {
        int counter = 0;

        for (var elem : array) {
            if (countDigits(elem) % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    private static int countDigits(int elem) {
        int count = 0;

        while (elem != 0) {
            elem /= 10;
            count++;
        }

        return count;
    }
}
