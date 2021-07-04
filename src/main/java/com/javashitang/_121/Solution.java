package com.javashitang._121;

/**
 * @author lilimin
 * @since 2021-07-02
 */
class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];
        dp[len - 1] = prices[len - 1];
        for (int i = prices.length - 2; i >= 0 ; i--) {
            if (prices[i] > dp[i + 1]) {
                dp[i] = prices[i];
            } else {
                dp[i] = dp[i+1];
            }
        }
        int max = 0;
        for (int i = 0; i < len; i++) {
            if (dp[i] - prices[i] > max) {
                max = dp[i] - prices[i];
            }
        }
        return max;
    }
}
