package com.javashitang.bfs._1091;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-08-17
 */
class Solution {

    // 代表8个方向 左，右，上，下
    // 左上，左下，右上，右下
    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid[0][0] == 1) {
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            int[] item = queue.poll();
            for (int i = 0; i < 8; i++) {
                int newx = item[0] + dir[i][0];
                int newy = item[1] + dir[i][1];
                while (check(newx, newy, grid.length)) {

                }
            }
        }
    }

    public boolean check(int newx, int newy, int n) {
        if (newx > 0 && newx < n && newy > 0 && newy < n) {
            return true;
        }
        return false;
    }
}
