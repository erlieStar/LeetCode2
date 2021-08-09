package com.javashitang.backtracking._22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-07-05
 *
 * 排列问题
 */
class Solution {

    public char[] brackets = {'(', ')'};

    public List<String> generateParenthesis(int n) {
        List<String> resultList = new ArrayList<>();
        backtracking(resultList, new char[2 * n], 0);
        return resultList;
    }

    public void backtracking(List<String> resultList, char[] items, int cur) {
        if (cur == items.length) {
            if (valid(items)) {
                resultList.add(new String(items));
            }
            return;
        }
        for (int i = 0; i < brackets.length; i++) {
            items[cur] = brackets[i];
            backtracking(resultList, items, cur + 1);
        }
    }

    public boolean valid(char[] items) {
        Stack<Character> stack = new Stack<>();
        for (char item : items) {
            if (stack.isEmpty()) {
                stack.push(item);
            } else if (stack.peek() == '(' && item == ')') {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
        return stack.isEmpty();
    }
}