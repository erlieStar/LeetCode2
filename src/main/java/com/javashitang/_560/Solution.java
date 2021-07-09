package com.javashitang._560;

/**
 * @author lilimin
 * @since 2021-07-09
 */
class Solution {

    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int[] dp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            dp[i + 1] = sum;
        }
        int total = 0;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[i] - dp[j] == k) {
                    total++;
                }
            }
        }
        return total;
    }

}
