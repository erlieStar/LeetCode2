package com.javashitang.sort._offer_40.case2;


import java.util.PriorityQueue;

/**
 * @author lilimin
 * @since 2021-08-25
 */
class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> num2 - num1);
        for (int num : arr) {
            if (queue.size() < k) {
                queue.add(num);
            } else if (num < queue.peek()) {
                queue.poll();
                queue.add(num);
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
