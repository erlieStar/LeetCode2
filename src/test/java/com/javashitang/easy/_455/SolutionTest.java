package com.javashitang.easy._455;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        int num = solution.findContentChildren(g,s);
        assertEquals(num, 1);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        int num = solution.findContentChildren(g,s);
        assertEquals(num, 2);
    }
}