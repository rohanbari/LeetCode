/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

class PerfectSquares_279 {

    public static boolean isSquare(int n) {
        double sqrt = Math.sqrt(n);
        return sqrt == (int) sqrt;
    }
    
    public static int numSquares(int n) {
        while (n % 4 == 0)
            n /= 4;

        if (n % 8 == 7)
            return 4;

        if (isSquare(n))
            return 1;

        double sqrt = Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            int y = n - i * i;
            if (isSquare(y))
                return 2;
        }

        return 3;
    }
}
