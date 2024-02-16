/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class LeastUniqueIntegers_1481 {

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> queue = new PriorityQueue<>(map.values());

        while (k > 0)
            k -= queue.poll();

        return (k < 0) ? queue.size() + 1 : queue.size();
    }
}
