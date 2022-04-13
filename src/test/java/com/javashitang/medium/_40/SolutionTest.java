package com.javashitang.medium._40;

import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testCombinationSum2() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(lists);
    }

    public void testCombinationSum23() {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum2(new int[]{2,5,2,1,2}, 5);
        System.out.println(lists);
    }
}