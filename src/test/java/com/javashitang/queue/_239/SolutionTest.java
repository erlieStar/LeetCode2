package com.javashitang.queue._239;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class SolutionTest {

    @Test
    public void maxSlidingWindow() {
        Solution solution = new Solution();
        int[] array = {1,3,-1,-3,5,3,6,7};
        int[] ints = solution.maxSlidingWindow(array, 3);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    @Test
    public void test1() {
        PriorityQueue<Integer> queue = new PriorityQueue<>(2, (a, b) -> b - a);
        queue.add(5);
        queue.add(1);
        queue.add(5);
        queue.add(7);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}