package com.javashitang.slidingWindow._76;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class SolutionTest {

    @Test
    public void minWindow() {
        Solution solution = new Solution();
        String result = solution.minWindow("ADOBECODEBANC", "ABC");
        System.out.println(result);
    }

    @Test
    public void minWindow1() {
        Solution solution = new Solution();
        String result = solution.minWindow("a", "a");
        System.out.println(result);
    }
}