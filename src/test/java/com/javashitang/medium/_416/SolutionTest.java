package com.javashitang.medium._416;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canPartition() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 11, 5};
        boolean flag = solution.canPartition(nums);
        assertTrue(flag);
    }

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 5};
        boolean flag = solution.canPartition(nums);
        assertFalse(flag);
    }
}