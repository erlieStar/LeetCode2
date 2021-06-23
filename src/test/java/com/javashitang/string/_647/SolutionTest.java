package com.javashitang.string._647;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-23
 */
public class SolutionTest {

    @Test
    public void countSubstrings() {
        Solution solution = new Solution();
        String s = "aaa";
        System.out.println(solution.countSubstrings(s));
        s = "a";
        System.out.println(solution.countSubstrings(s));
    }
}