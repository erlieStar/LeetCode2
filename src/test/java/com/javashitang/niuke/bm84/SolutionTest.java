package com.javashitang.niuke.bm84;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testLongestCommonPrefix() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"abc", "bcd"});
        System.out.println(s);
    }


    public void testLongestCommonPrefix1() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"abc"});
        System.out.println(s);
    }

    public void testLongestCommonPrefix2() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"abc", "abd"});
        System.out.println(s);
    }

    public void testLongestCommonPrefix3() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"c", "c"});
        System.out.println(s);
    }

    public void testLongestCommonPrefix4() {
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(new String[]{"abc", "abc"});
        System.out.println(s);
    }
}