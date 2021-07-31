package com.javashitang._200;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-31
 */
public class SolutionTest {

    @Test
    public void numIslands() {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Solution solution = new Solution();
        int count = solution.numIslands(grid);
        System.out.println(count);
    }

    @Test
    public void numIslands2() {
        char[][] grid = {
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'},
        };
        Solution solution = new Solution();
        int count = solution.numIslands(grid);
        System.out.println(count);
    }
}