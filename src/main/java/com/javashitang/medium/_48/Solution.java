package com.javashitang.medium._48;

class Solution {

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (i < j) {
                    swap(matrix, i, j, j, i);
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n / 2; j++) {
                swap(matrix, i , j, i, n - j);
            }
        }
    }

    public void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        int temp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = temp;
    }
}
