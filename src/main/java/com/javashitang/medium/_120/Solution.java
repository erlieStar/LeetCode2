package com.javashitang.medium._120;

import java.util.List;

public class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }
        // 这里行和列加1，是为了不用处理最下面一行的边界
        int[][] dp = new int[triangle.size() + 1][triangle.size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> rows = triangle.get(i);
            for (int j = 0; j < rows.size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + rows.get(j);
            }
        }
        return dp[0][0];
    }
}
