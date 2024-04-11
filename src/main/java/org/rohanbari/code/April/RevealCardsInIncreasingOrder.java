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

package org.rohanbari.code.April;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 950. Reveal Cards In Increasing Order
 */
class RevealCardsInIncreasingOrder {

    public int[] deckRevealedIncreasing(int[] deck) {
        final int LEN = deck.length;
        Queue<Integer> queue = new LinkedList<>();

        // Putting the indexes of the deck in the queue
        for (int i = 0; i < LEN; i++) {
            queue.offer(i);
        }

        // Sorting the array to match the cases later
        Arrays.sort(deck);

        int[] result = new int[LEN];
        for (int i = 0; i < LEN; i++) {
            result[queue.poll()] = deck[i];
            queue.offer(queue.poll());
        }

        return result;
    }
}
