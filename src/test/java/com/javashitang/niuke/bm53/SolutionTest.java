package com.javashitang.niuke.bm53;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMinNumberDisappeared() {
        Solution solution = new Solution();
        System.out.println(solution.minNumberDisappeared(new int[]{1, 0, 2}));
    }

    public void test1() {
        Solution solution = new Solution();
        System.out.println(solution.minNumberDisappeared(new int[]{-2,3,4,1,5}));
    }
}