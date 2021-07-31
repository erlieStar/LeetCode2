package com.javashitang.backtracking._494.case2;

/**
 * @author lilimin
 * @since 2021-07-31
 */
class Solution {

    public int findTargetSumWays(int[] nums, int target) {
        int[][] dp = new int[nums.length][2];
        dp[0][0] = -nums[0];
        dp[0][1] = nums[1];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < 2; j++) {
            }
        }
        return 0;
    }
}
