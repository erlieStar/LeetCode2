package com.javashitang.easy._605;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] flowers = {1, 0, 0, 0, 1};
        boolean flag = solution.canPlaceFlowers(flowers, 1);
        assertTrue(flag);
    }


    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] flowers = {1, 0, 0, 0, 1};
        boolean flag = solution.canPlaceFlowers(flowers, 2);
        assertFalse(flag);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[] flowers = {1, 0, 1, 0, 1, 0, 1};
        boolean flag = solution.canPlaceFlowers(flowers, 1);
        assertFalse(flag);
    }
}