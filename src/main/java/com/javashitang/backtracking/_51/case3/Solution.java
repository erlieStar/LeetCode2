package com.javashitang.backtracking._51.case3;
/**
 * @author lilimin
 * @since 2021-08-16
 */
public class Solution {

    int sum = 0;

    public int solveNQueens(int n) {
        int[] loc = new int[n];
        // 用数组的第一维表示列，主对角线，副对角线
        int[][] visit = new int[3][2 * n];
        backtracking(loc, visit, n, 0);
        return sum;
    }

    public void backtracking(int[] loc, int[][] visit, int n, int cur) {
        if (cur == n) {
            sum++;
            return;
        }
        for (int i = 0; i < n; i++) {
            // 检查第cur行的第i列否和前面的皇后冲突
            if (visit[0][i] != 1 && visit[1][cur - i + n] != 1 && visit[2][cur + i] != 1) {
                // cur行的皇后放在第i列，如果不用打印这个数组都可以省略
                loc[cur] = i;
                visit[0][i] = visit[1][cur - i + n] = visit[2][cur + i] = 1;
                // 这一步一定要有，撤销选择
                backtracking(loc, visit, n, cur + 1);
                visit[0][i] = visit[1][cur - i + n] = visit[2][cur + i] = 0;
            }
        }
    }
}
