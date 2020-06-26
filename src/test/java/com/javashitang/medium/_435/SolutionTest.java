package com.javashitang.medium._435;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int num = solution.eraseOverlapIntervals(intervals);
        assertEquals(1, num);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] intervals = {{1, 2}, {1, 2}, {1, 2}};
        int num = solution.eraseOverlapIntervals(intervals);
        assertEquals(2, num);
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        int[][] intervals = {{1, 2}, {2, 3}};
        int num = solution.eraseOverlapIntervals(intervals);
        assertEquals(0, num);
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        int[][] intervals = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        int num = solution.eraseOverlapIntervals(intervals);
        assertEquals(2, num);
    }

}