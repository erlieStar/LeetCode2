package com.javashitang.recursion._70.case3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class SolutionTest {

    @Test
    public void climbStairs() {
        Solution solution = new Solution();
        int count = solution.climbStairs(45);
        System.out.println(count);
    }
}