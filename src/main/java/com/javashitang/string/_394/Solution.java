package com.javashitang.string._394;

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
 */
class Solution {

    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        String result = "";
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (item >= '0' && item <= '9') {
                num = num * 10 + item - '0';
            } else if (item == '[') {
                numStack.push(num);
                if (result != "") {
                    charStack.push(result);
                    result = "";
                }
                num = 0;
            } else if (item == ']') {
                if (result != "") {
                    charStack.push(result);
                    result = "";
                }
                String newStr = "";
                String str = charStack.pop();
                Integer total = numStack.pop();
                for (int j = 0; j < total; j++) {
                    newStr += str;
                }
                charStack.push(newStr);
            } else {
                result += item;
            }
        }
        String finalResult = "";
        while (!charStack.isEmpty()) {
            finalResult = charStack.pop() + finalResult;
        }
        return finalResult;
    }
}
