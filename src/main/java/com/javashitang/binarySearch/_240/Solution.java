package com.javashitang.binarySearch._240;

/**
 * @author lilimin
 * @since 2021-06-28
 */
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            if (matrix[i][0] > target) {
                return false;
            }
            int left = 0;
            int right = matrix[i].length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (matrix[i][mid] == target) {
                    return true;
                } else if (matrix[i][mid] > target) {
                    right = mid - 1;
                } else if (matrix[i][mid] < target) {
                    left = mid + 1;
                }
            }
        }
        return false;
    }
}