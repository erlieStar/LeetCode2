package com.javashitang.dfs._200;

/**
 * @author lilimin
 * @since 2021-08-20
 */
class Solution {

    int[][] dir = {{-1, 1, 0, 0},{0, 0, -1, 1}};

    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    sum++;
                    dfs(i, j, grid);
                }
            }
        }
        return sum;
    }

    public void dfs(int row, int column, char[][] grid) {
        // 区间合法性判断
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length) {
            return;
        }
        if (grid[row][column] == '1') {
            grid[row][column] = '0';
            for (int i = 0; i < dir[0].length; i++) {
                dfs(row + dir[0][i], column + dir[1][i], grid);
            }
        }
    }

}