package com.javashitang.dynamic._64;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-25
 */
public class SolutionTest {

    @Test
    public void minPathSum() {
        Solution solution = new Solution();
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int sum = solution.minPathSum(grid);
        System.out.println(sum);
    }
}