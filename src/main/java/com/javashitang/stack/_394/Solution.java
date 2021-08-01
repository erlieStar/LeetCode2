package com.javashitang.stack._394;

import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-07-05
 *
 * 3[a]2[bc]
 * aaabcbc
 *
 * 3[a2[c]]
 * accaccacc
 *
 * 3[a2[c]]
 */
class Solution {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item >= '0' && item <= '9') {
                num = num * 10 + item - '0';
            } else if (item == '[') {
                numStack.push(num);
                charStack.push(result.toString());
                result = new StringBuilder();
                num = 0;
            } else if (item == ']') {
                StringBuilder newStr = new StringBuilder();
                Integer total = numStack.pop();
                for (int j = 0; j < total; j++) {
                    newStr.append(result);
                }
                result = new StringBuilder(charStack.pop() + newStr);
            } else {
                result.append(item);
            }
        }
        return result.toString();
    }
}
