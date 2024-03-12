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

import java.util.HashMap;
import java.util.Map;

/**
 * 1171. Remove Zero Sum Consecutive Nodes from Linked List
 */
class RemoveZeroSumLL {

    /**
     * ListNode definition.
     */
    static class ListNode {
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

        /**
         * Removes any consecutive terms that sums up to zero.
         * 
         * @param head Head of the first term
         * @return Modified LinkedList
         */
        public ListNode removeZeroSumSublists(ListNode head) {
            Map<Integer, ListNode> map = new HashMap<>();

            ListNode sumNode = new ListNode(0);
            sumNode.next = head;

            int sum = 0;
            for (ListNode it = sumNode; it != null; it = it.next) {
                sum += it.val;
                map.put(sum, it);
            }

            sum = 0;
            for (ListNode it = head; it != null; it = it.next) {
                sum += it.val;
                it.next = map.get(sum).next;
            }

            return sumNode.next;
        }
    }
}
