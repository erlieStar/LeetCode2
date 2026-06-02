package com.javashitang.niuke.bm92._2;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMaxLength() {
        Solution solution = new Solution();
        int result = solution.maxLength(new int[]{1, 2, 3, 4, 5});
        System.out.println(result);
    }

    public void testMaxLength1() {
        Solution solution = new Solution();
        int result = solution.maxLength(new int[]{2, 2, 3, 4, 3});
        System.out.println(result);
    }

    // [3,3,2,1,3,3,3,1]
    // 预期 3
    // 实际 4
    public void testMaxLength3() {
        Solution solution = new Solution();
        int result = solution.maxLength(new int[]{3,3,2,1,3,3,3,1});
        System.out.println(result);
    }
}