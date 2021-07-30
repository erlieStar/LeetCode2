package com.javashitang.recursion._96;

/**
 * @author lilimin
 * @since 2021-07-30
 */
class Solution {
    public int numTrees(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[i - 1 - j] * dp[j];
            }
        }
        return dp[n];
    }
}
