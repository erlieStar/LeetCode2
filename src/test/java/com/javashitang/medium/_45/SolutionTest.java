package com.javashitang.medium._45;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testJump() {
        Solution solution = new Solution();
        int result = solution.jump(new int[]{2, 3, 1, 1, 4});
        System.out.println(result);
    }

    public void testJump1() {
        Solution solution = new Solution();
        solution.jump(new int[]{1, 2});
    }

    public void testJump2() {
        Solution solution = new Solution();
        int jump = solution.jump(new int[]{0});
        System.out.println(jump);
    }
}