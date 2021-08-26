package com.javashitang.stack._42;

import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-06-24
 * 接雨水
 */
class Solution {
    
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            int num = height[i];
            while (!stack.isEmpty() && height[stack.peek()] < num) {
                int left = stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return sum;
    }
}
