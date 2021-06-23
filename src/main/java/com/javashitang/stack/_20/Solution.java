package com.javashitang.stack._20;

import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-06-23
 * 有效的括号
 */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character temp = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(temp);
            } else if (temp == ')' && stack.peek() == '(') {
                stack.pop();
            } else if (temp == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (temp == '}' && stack.peek() == '{') {
                stack.pop();
            } else {
                stack.add(temp);
            }
        }
        return stack.isEmpty();
    }
}
