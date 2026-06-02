package com.javashitang.niuke.bm58;

import junit.framework.TestCase;

import java.util.ArrayList;

public class SolutionTest extends TestCase {

    public void testPermutation() {
        Solution solution = new Solution();
        ArrayList<String> result = solution.Permutation("abc");
        System.out.println(result);
    }
}