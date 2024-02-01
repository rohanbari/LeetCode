/*
 * Copyright (c) 2024 Rohan Bari <rohanbari@outlook.com>
 */

package org.rohanbari.code;

import java.util.Stack;

class ValidParentheses_20 {

    /**
     * Checks if the pairs of parentheses are valid or not.
     *
     * @param s The string to be checked
     * @return Validation of pair(s)
     */
    public static boolean isValid(final String s) {
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

//        /**
//     * My attempt.
//     *
//     * @param s The string
//     * @return If it has a pair of strings
//     */
//    public static boolean isValidParentheses(final String s) {
//        if (s.contains("(")) {
//            if (!s.contains("()")) {
//                return false;
//            }
//        }
//
//        if (s.contains("{")) {
//            if (!s.contains("{}")) {
//                return false;
//            }
//        }
//
//        if (s.contains("[")) {
//            return s.contains("[]");
//        }
//
//        return true;
//    }
}
