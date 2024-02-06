/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.*;

class GroupAnagrams_49 {

    public static List<List<String>> groupAnagrams(String[] strs) {
        // To store the collection of collections
        List<List<String>> lists = new ArrayList<>();
        // To store the comparison factors
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // To sort the strings in the array
            char[] tempStr = s.toCharArray();
            Arrays.sort(tempStr);
            String str = String.valueOf(tempStr);

            if (map.get(str) != null) {
                // Adding to a temporary list
                List<String> tempList = map.get(str);
                tempList.add(s);
                map.put(str, tempList);
            } else {
                map.put(str, new ArrayList<>(Collections.singleton(s)));
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            lists.add(entry.getValue());
        }

        return lists;
    }
}
