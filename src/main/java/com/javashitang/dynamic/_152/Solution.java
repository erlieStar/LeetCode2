package com.javashitang.dynamic._152;

/**
 * @author lilimin
 * @since 2021-06-25
 */
class Solution {

    public int maxProduct(int[] nums) {
        int[][] dp = new int[nums.length][2];
        int max = dp[0][0] = dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i][0] = Math.max(Math.max(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]), nums[i]);
            dp[i][1] = Math.min(Math.min(dp[i - 1][0] * nums[i], dp[i - 1][1] * nums[i]), nums[i]);
            max = Math.max(max, dp[i][0]);
        }
        return max;
    }
}