package com.javashitang.bfs._200;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-08-20
 */
class Solution {

    // 分别代表上下左右4个方向
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int numIslands(char[][] grid) {
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    sum++;
                    bfs(i, j, grid);
                }
            }
        }
        return sum;
    }

    public void bfs(int row, int column, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{row, column});
        grid[row][column] = '0';
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] item = queue.poll();
                for (int j = 0; j < dir.length; j++) {
                    int x = item[0] + dir[j][0];
                    int y = item[1] + dir[j][1];
                    if (x < 0 || x >= grid.length || y < 0
                            || y >= grid[0].length || grid[x][y] == '0') {
                        continue;
                    }
                    queue.add(new int[]{x, y});
                    grid[x][y] = '0';
                }
            }
        }
    }
}
