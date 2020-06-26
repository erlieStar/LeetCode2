package com.javashitang.medium._452;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        int[][] intervals = {{10,16}, {2,8}, {1,6}, {7,12}};
        int num = solution.findMinArrowShots(intervals);
        assertEquals(2, num);
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        int[][] intervals = {{1,2},{3,4},{5,6},{7,8}};
        int num = solution.findMinArrowShots(intervals);
        assertEquals(4, num);
    }
}