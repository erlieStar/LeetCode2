package com.javashitang.Interview._08_09;

import java.util.*;

class Solution {

    char[] symbol = {'(', ')'};
    Set<String> result = new HashSet<>();
    Set<String> finalResult = new HashSet<>();

    public List<String> generateParenthesis(int n) {
        char[] items = new char[2 * n];
        back(0, n, items);
        for (String s : result) {
            if (valid(s)) {
                finalResult.add(s);
            }
        }
        return new ArrayList<>(finalResult);
    }

    public void back(int cur, int n, char[] items) {
        if (cur == 2 * n) {
            result.add(String.valueOf(items));
            return;
        }
        for (int i = 0; i < 2; i++) {
            items[cur] = symbol[i];
            back(cur + 1, n, items);
        }
    }

    public boolean valid(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
            } else if ((stack.peek() == '(' && str.charAt(i) == ')')) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
