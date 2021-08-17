package com.javashitang.backtracking._51.case2;
/**
 * @author lilimin
 * @since 2021-08-16
 */
public class Solution {

    int sum = 0;

    public int solveNQueens(int n) {
        int[] loc = new int[n];
        backtracking(loc, n, 0);
        return sum;
    }

    public void backtracking(int[] loc, int n, int cur) {
        if (cur == n) {
            sum++;
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            // cur行的皇后放在第i列
            loc[cur] = i;
            // 检查是否和前面的皇后冲突
            for (int j = 0; j < cur; j++) {
                // 判断主对角线，副对角线，列是否重复
                if (cur - loc[cur] == j - loc[j] || cur + loc[cur] == j + loc[j]
                        || loc[cur] == loc[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                backtracking(loc, n, cur + 1);
            }
        }
    }
}
