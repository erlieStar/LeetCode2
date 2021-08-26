package com.javashitang.queue._239;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> results = new ArrayList<>();
        List<Integer> items = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                items.add(i, nums[i]);
                queue.add(nums[i]);
                if (i == k - 1) {
                    results.add(queue.peek());
                }
            } else {
                queue.add(nums[i]);
                queue.remove(nums[i - k]);
                results.add(queue.peek());
            }
        }
        return results.stream().mapToInt(Integer::intValue).toArray();
    }
}
