package com.javashitang.medium._46._2;

import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testPermute() {
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permute(new int[]{1, 2, 3});
        System.out.println(permute);
    }
}