package com.javashitang.medium._309;

class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (dp[i-1][1] + prices[i] > dp[i-1][0]) {
                dp[i][0] = dp[i-1][1] + prices[i];
                dp[i][2] = 1;
            } else {
                dp[i][0] = dp[i-1][0];
            }
            if (dp[i-1][2] == 0) {
                dp[i][1] = Math.max(dp[i-1][0] - prices[i], dp[i-1][1]);
            } else {
                dp[i][1] = dp[i-1][1];
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(dp[i][0] + " " + dp[i][1]);
        }
        return dp[prices.length-1][0];
    }
}
