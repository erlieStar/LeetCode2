package com.javashitang.backtracking._51.case2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-17
 */
public class SolutionTest {

    @Test
    public void solveNQueens() {
        Solution solution = new Solution();
        int result = solution.solveNQueens(8);
        System.out.println(result);
    }

    @Test
    public void solveNQueens2() {
        Solution solution = new Solution();
        int result = solution.solveNQueens(4);
        System.out.println(result);
    }
}