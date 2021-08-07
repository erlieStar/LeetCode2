package com.javashitang.queue._239.case2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] a, int[] b) -> {
            return a[0] != b[0] ? a[0] - b[0] : a[1] - b[1];
        });
        return null;
    }
}
