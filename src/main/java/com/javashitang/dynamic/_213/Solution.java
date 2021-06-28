package com.javashitang.dynamic._213;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = 0;
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][0]);
            dp[i][1] = nums[i] + dp[i - 1][0];
        }
        return Math.max(dp[nums.length - 1][0], dp[nums.length - 1][1]);
    }
}
