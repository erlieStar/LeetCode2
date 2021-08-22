package com.javashitang.bfs._200;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class SolutionTest {

    @Test
    public void numIslands() {
        char[][] grid = {{'1', '1', '1'}, {'1', '1', '1'}};
        Solution solution = new Solution();
        int count = solution.numIslands(grid);
        System.out.println(count);
    }
}