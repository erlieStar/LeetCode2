package com.javashitang.backtracking._51.case3;

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
        int num = solution.solveNQueens(4);
        System.out.println(num);
    }
}