package com.javashitang.niuke.nc20;

import junit.framework.TestCase;

/**
 * @Author lilimin
 * @Date 2026/6/4
 */
public class SolutionTest extends TestCase {

    public void testRestoreIpAddresses() {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("25525522135"));
    }

    public void testRestoreIpAddresses1() {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("1111"));
    }

    public void testRestoreIpAddresses2() {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("000256"));
    }
}