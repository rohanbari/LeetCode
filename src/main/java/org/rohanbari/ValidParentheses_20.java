/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari;

import java.util.Stack;

public class ValidParentheses_20 {

    /**
     * Checks if the pairs of parentheses are valid or not.
     *
     * @param s The string to be checked
     * @return Validation of pair(s)
     */
    private static boolean isValid(final String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(')');
            } else if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
