package com.javashitang.hard._329;

class Solution {

    // 上 下 左 右
    int[][] dir = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int longestIncreasingPath(int[][] matrix) {
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] visit = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max, dfs(m, n, matrix, visit, i, j));
            }
        }
        return max;
    }

    public int dfs(int m, int n, int[][] matrix, int[][] visit, int x, int y) {
        if (visit[x][y] != 0) {
            return visit[x][y];
        }
        visit[x][y] = 1;
        for (int i = 0; i < dir.length; i++) {
            int newx = x + dir[i][0];
            int newy = y + dir[i][1];
            if (newx >= 0 && newx < m && newy >= 0 && newy < n && matrix[x][y] < matrix[newx][newy]) {
                visit[x][y] = Math.max(visit[x][y], 1 + dfs(m, n, matrix, visit, newx, newy));
            }
        }
        return visit[x][y];
    }
}
