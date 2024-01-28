/*
 * Copyright (c) 2023-2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * This file is dedicated to the problem I am currently working on.
 */
public class Main {

    /**
     * The main method.
     *
     * @param args System arguments
     */
    public static void main(String[] args) {
        System.out.println("Working on: 3Sum");

        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && k != i) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> subList = new ArrayList<>();

                            subList.add(nums[i]);
                            subList.add(nums[j]);
                            subList.add(nums[k]);

                            list.add(subList);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(new HashSet<>(list));
    }
}