package com.javashitang.medium._45;

import java.util.Arrays;

class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 10001);
        for (int i = 0; i < nums[0] && i < nums.length; i++) {
            dp[i] = 1;
        }
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= nums[i] && i + j < nums.length; j++) {
                dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
            }
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(dp[i] + " ");
//        }
        return dp[nums.length - 1];
    }
}
