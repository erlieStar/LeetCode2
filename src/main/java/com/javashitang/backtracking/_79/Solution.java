package com.javashitang.backtracking._79;

/**
 * @author lilimin
 * @since 2021-08-05
 *
 * 排列
 */
class Solution {

    int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(i, j, board, word, 0);
                if (flag) {
                    return flag;
                }
            }
        }
        return flag;
    }

    public void dfs(int row, int column, char[][] board, String word, int cur) {
        if (!(row >= 0 && row < board.length && column >= 0
                && column < board[0].length && board[row][column] != '.')) {
            return;
        }
        if (board[row][column] == word.charAt(cur)) {
            if (cur == word.length() - 1) {
                flag = true;
                return;
            }
            for (int i = 0; i < dir.length; i++) {
                char temp = board[row][column];
                board[row][column] = '.';
                dfs(row + dir[i][0], column + dir[i][1], board, word, cur + 1);
                board[row][column] = temp;
            }
        }
    }
}
