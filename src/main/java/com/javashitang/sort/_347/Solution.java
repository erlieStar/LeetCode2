package com.javashitang.sort._347;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author lilimin
 * @since 2021-08-25
 */
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // 整数 - 频次
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] num1, int[] num2) -> num1[1] - num2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (queue.size() < k) {
                queue.add(new int[] {key, value});
            } else if (queue.peek()[1] < value) {
                queue.poll();
                queue.add(new int[] {key, value});
            }
        }
        int[] array = new int[k];
        for (int i = 0; i < k; i++) {
            array[i] = queue.poll()[0];
        }
        return array;
    }
}
