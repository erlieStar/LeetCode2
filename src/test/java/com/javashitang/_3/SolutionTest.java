package com.javashitang._3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }

    @Test
    public void lengthOfLongestSubstring1() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abc");
        System.out.println(result);
    }
}