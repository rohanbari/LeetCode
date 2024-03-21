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

/**
 * 1669. Merge In Between Linked Lists
 */
class MergeInLL {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // Check whether any of the lists are empty
        if (list1 == null || list2 == null)
            return null;

        // Traverse from the starting point to the ath index
        ListNode start = list1;
        for (int i = 0; i < a - 1; i++)
            start = start.next;

        // Traverse up to the bth index
        ListNode end = start;
        for (int i = a; i <= b; i++)
            end = end.next;

        // The ath element will be the beginning of the second list
        start.next = list2;

        // Traversing through the elements of the second list
        while (list2.next != null)
            list2 = list2.next;

        // Merging the last node of the second list to the remaining of the
        // first list
        list2.next = end.next;

        return list1;
    }
}
