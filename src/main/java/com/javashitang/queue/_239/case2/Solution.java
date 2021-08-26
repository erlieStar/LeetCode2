package com.javashitang.queue._239.case2;


import java.util.Deque;
import java.util.LinkedList;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            // 单调递增队列的最大值已经不在窗口内了
            if (deque.peek() <= i - k) {
                deque.poll();
            }
            // 窗口形成，开始取最大值
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }
}
