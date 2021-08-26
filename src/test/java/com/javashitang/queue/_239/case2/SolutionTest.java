package com.javashitang.queue._239.case2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-26
 */
public class SolutionTest {

    @Test
    public void maxSlidingWindow() {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        Solution solution = new Solution();
        // [3,3,5,5,6,7]
        int[] result = solution.maxSlidingWindow(nums, 3);
        for (int i : result) {
            System.out.println(i);
        }
    }
}