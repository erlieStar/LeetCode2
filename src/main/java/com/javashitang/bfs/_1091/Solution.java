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
        int n = grid.length - 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        grid[0][0] = 1;
        int result = 0;
        while (!queue.isEmpty()) {
            result++;
            int size = queue.size();
            // 判断的时候不能用 i < queue.size()，因为queue.size()的值在一直变
            for (int i = 0; i < size; i++) {
                int[] item = queue.poll();
                for (int j = 0; j < 8; j++) {
                    if (item[0] == n && item[1] == n) {
                        return result;
                    }
                    int x = item[0] + dir[j][0];
                    int y = item[1] + dir[j][1];
                    if (x < 0 || x > n || y < 0 || y > n || grid[x][y] == 1) {
                        continue;
                    }
                    queue.add(new int[] {x, y});
                    grid[x][y] = 1;
                }
            }
        }
        return -1;
    }
}
