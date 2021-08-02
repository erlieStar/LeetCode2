package com.javashitang.dynamic._221;

/**
 * @author lilimin
 * @since 2021-08-02
 */
class Solution {

    public int maximalSquare(char[][] matrix) {
        int[][] dp = new int[matrix.length + 1][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0) {
                    dp[i + 1][j] = matrix[i][j] - '0';
                } else {
                    dp[i + 1][j] = dp[i][j] + matrix[i][j] - '0';
                }
            }
        }
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j <= matrix.length; j++) {
                int length = 0;
                int maxLength = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    if (dp[j][k] - dp[i][k] == j - i) {
                        length++;
                        maxLength = Math.max(maxLength, length);
                    } else {
                        length = 0;
                    }
                }
                // 要求是正方形
                if (maxLength >= j - i) {
                    if ((j - i) * (j - i) > max) {
                        max = (j - i) * (j - i);
                    }
                }
            }
        }
        return max;
    }
}
