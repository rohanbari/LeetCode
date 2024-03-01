/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code.February;

class CherryPickupII_1463 {

    public static int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Integer[][][] dp = new Integer[m][n][n];

        return move(grid, m, n, 0, 0, n - 1, dp);
    }

    private static int move(int[][] grid, int m, int n, int r, int c1, int c2, Integer[][][] dp) {
        if (r == m)
            return 0;

        if (dp[r][c1][c2] != null)
            return dp[r][c1][c2];

        int sum = 0;

        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++) {
                int nc1 = c1 + i;
                int nc2 = c2 + j;

                if (nc1 >= 0 && nc1 < n && nc2 >= 0 && nc2 < n)
                    sum = Math.max(sum,
                            move(grid, m, n, r + 1, nc1, nc2, dp));
            }

        int cherries = (c1 == c2) ? grid[r][c1] : grid[r][c1] + grid[r][c2];
        return dp[r][c1][c2] = sum + cherries;
    }
}
