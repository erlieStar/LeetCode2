package com.javashitang.dynamic._85;

/**
 * @author lilimin
 * @since 2021-08-05
 */
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
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
                if (maxLength * (j - i) > max) {
                    max = maxLength * (j - i);
                }
            }
        }
        return max;
    }
}
