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

/**
 * 79. Word Search
 */
class WordSearch {

    private boolean[][] visited;

    /**
     * Searches for the word using backtracking.
     * 
     * @param board The board matrix
     * @param word  The word
     * @return Returns true if the word exists in board.
     */
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (word.charAt(0) == board[i][j] && search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean search(char[][] board, String word, int i, int j, int idx) {
        if (idx == word.length()) {
            return true;
        }

        if (i >= board.length || i < 0 || j >= board[i].length ||
                j < 0 || board[i][j] != word.charAt(idx) || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;

        if (search(board, word, i - 1, j, idx + 1)
                || search(board, word, i + 1, j, idx + 1)
                || search(board, word, i, j - 1, idx + 1)
                || search(board, word, i, j + 1, idx + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;
    }
}
