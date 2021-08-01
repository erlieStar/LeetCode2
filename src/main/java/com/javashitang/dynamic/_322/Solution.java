package com.javashitang.dynamic._322;

/**
 * @author lilimin
 * @since 2021-08-01
 */
class Solution {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            Integer min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                for (int k = 1; k * coins[j] <= i; k++) {
                    if (dp[i - k * coins[j]] != -1) {
                        if (k + dp[i - k * coins[j]] < min) {
                            min = k + dp[i - k * coins[j]];
                        }
                    }
                }
            }
            dp[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return dp[amount];
    }
}
