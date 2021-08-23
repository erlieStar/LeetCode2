package com.javashitang.dfs._1091;

/**
 * @author lilimin
 * @since 2021-08-23
 * 超时
 */
public class Solution {

    // 代表8个方向 左，右，上，下
    // 左上，左下，右上，右下
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    int min = Integer.MAX_VALUE;

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }
        int n = grid.length - 1;
        backtracking(grid, n,0, 0, 1);
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public void backtracking(int[][] grid, int n, int row, int column, int step) {
        // 当前走的路径已经大于等于目前最少的步数了，没必要再搜索了
        if (step >= min) {
            return;
        }
        if (row == n && column == n) {
            min = Math.min(min, step);
            return;
        }
        for (int i = 0; i < 8; i++) {
            int x = row + dir[i][0];
            int y = column + dir[i][1];
            if (x < 0 || x > n || y < 0 || y > n || grid[x][y] == 1) {
                continue;
            }
            grid[x][y] = 1;
            backtracking(grid, n, x, y, step + 1);
            grid[x][y] = 0;
        }
    }
}
