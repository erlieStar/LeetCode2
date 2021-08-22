package com.javashitang.bfs._1091;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-20
 */
public class SolutionTest {

    @Test
    public void shortestPathBinaryMatrix() {
        Solution solution = new Solution();
        int[][] grid = new int[3][3];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 0;
            }
        }
        int num = solution.shortestPathBinaryMatrix(grid);
        System.out.println(num);
    }
}