package com.javashitang._3.case2;

import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution solution = new Solution();
        int result = solution.lengthOfLongestSubstring("abc");
        System.out.println(result);
    }
}