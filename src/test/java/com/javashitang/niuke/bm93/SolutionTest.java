package com.javashitang.niuke.bm93;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMaxArea() {
        Solution solution = new Solution();
        int result = solution.maxArea(new int[]{1, 7, 3, 2, 4, 5, 8, 2, 7});
        System.out.println(result);
    }
}