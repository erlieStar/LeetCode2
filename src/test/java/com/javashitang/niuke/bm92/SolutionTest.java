package com.javashitang.niuke.bm92;

import junit.framework.TestCase;

import java.util.SimpleTimeZone;

public class SolutionTest extends TestCase {

    public void testMaxLength() {
        Solution solution = new Solution();
        int result = solution.maxLength(new int[]{1, 2, 4, 5});
        System.out.println(result);
    }

    public void test1() {
        Solution solution = new Solution();
        int result = solution.maxLength(new int[]{2, 2, 3, 4, 3});
        System.out.println(result);
    }
}