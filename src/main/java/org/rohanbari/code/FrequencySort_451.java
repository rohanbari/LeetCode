/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.*;

class FrequencySort_451 {

    public static String myFrequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        // Filling A-Z with zeroes
        for (int i = 'A'; i <= 'Z'; i++)
            hashMap.put((char) i, 0);

        // Filling a-z with zeroes
        for (int i = 'a'; i <= 'z'; i++)
            hashMap.put((char) i, 0);

        // Counting process
        for (int i = 0; i < s.length(); i++)
            if (hashMap.containsKey(s.charAt(i)))
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);

        List<Character> charByFrequency = new ArrayList<>(hashMap.keySet());
        Collections.sort(charByFrequency);

        String result = "";
        for (int i = 0; i < charByFrequency.size(); i++) {
            result += String.valueOf(charByFrequency.get(i));
        }

        return result;
    }

    public static String frequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        // Initializing the HashMap for the required elements only instead of
        // 52 characters
        for (var ch : s.toCharArray())
            hashMap.put(ch, hashMap.getOrDefault(ch, 0) + 1);

        // PriorityQueue instance to prioritize by frequency
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );
        // All the HashMap elements are sent to the PQ
        priorityQueue.addAll(hashMap.entrySet());

        // This will be the final result
        StringBuilder stringBuilder = new StringBuilder();
        // As long as the PQ is not empty, an entry is retrieved and removed
        // from the queue. The retrieved entry is then used to append it into
        // the result.
        while (!priorityQueue.isEmpty()) {
            Map.Entry<Character, Integer> entry = priorityQueue.poll();
            stringBuilder.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        // The answer is returned
        return stringBuilder.toString();
    }
}
