package com.javashitang.stack.hdu_3250;

import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-06-24
 * 单调递增
 */
class Solution {

    public int getSeeLowSum(int[] heights) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <heights.length ; i++) {
            // 栈里面的牛比 i 这个牛还小，肯定看不到 i 这个牛以及之后的牛
            while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                stack.pop();
            }
            // i 这个牛能被看到的次数
            sum += stack.size();
            stack.push(heights[i]);
        }
        return sum;
    }
}
