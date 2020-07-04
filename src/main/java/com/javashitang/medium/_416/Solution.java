package com.javashitang.medium._416;

import java.util.Arrays;

public class Solution {

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        // 奇数直接false
        if ((sum & 1) == 1) {
            return false;
        }
        int target = sum >> 1;
        int[][] dp = new int[nums.length][target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (j >= nums[i]) {
                    if (i == 0) {
                        dp[i][j] = nums[i];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                    }
                }
            }
        }
        return dp[nums.length - 1][target] == target;
    }
}
