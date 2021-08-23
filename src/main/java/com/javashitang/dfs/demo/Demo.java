package com.javashitang.dfs.demo;

/**
 * @author lilimin
 * @since 2021-08-23
 */
public class Demo {

    int[][] dir = {{-1, 1, 0, 0}, {0, 0, -1, 1}};

    public int start(int[][] grid) {
        dfs(0, 0, grid);
        return 0;
    }

    public void dfs(int row, int column, int[][] grid) {
        // 区间合法性判断
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length) {
            System.out.println("invalid " + row + " " + column);
            return;
        }
        if (row == grid.length - 1 && column == grid[0].length - 1) {
            System.out.println("-----" + row + " " + column);
            return;
        }
        if (grid[row][column] == 0) {
            System.out.println(row + " " + column);
            grid[row][column] = 1;
            for (int i = 0; i < dir[0].length; i++) {
                dfs(row + dir[0][i], column + dir[1][i], grid);
            }
            grid[row][column] = 0;
        } else {
            System.out.println("visit " + row + " " + column);
        }
    }
}
