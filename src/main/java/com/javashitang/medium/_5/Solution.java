package com.javashitang.medium._5;

public class Solution {

    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        int max = 0;
        int start = 0;
        int end = 0;
        int[][] dp = new int[s.length()][s.length()];
        // 初始化1和2的回文子串
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            if (i > 0 && s.charAt(i-1) == s.charAt(i)) {
                dp[i-1][i] = 2;
                max = 2;
                start = i - 1;
                end = i;
            }
        }
        for (int j = 0; j < s.length(); j++) {
            for (int i = j - 2; i >= 0; i--) {
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1] != 0) {
                    if (dp[i][j] < dp[i+1][j-1] + 2) {
                        dp[i][j] = dp[i+1][j-1] + 2;
                        if (dp[i][j] > max) {
                            max = dp[i][j];
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
