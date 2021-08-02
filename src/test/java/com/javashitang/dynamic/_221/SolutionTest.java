package com.javashitang.dynamic._221;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-08-02
 */
public class SolutionTest {

    @Test
    public void maximalSquare() {
        char[][] items = {{'1', '1'}, {'1', '1'}};
        Solution solution = new Solution();
        int result = solution.maximalSquare(items);
        System.out.println(result);
    }

    @Test
    public void maximalSquare1() {
        char[][] items = {{'1', '0'}};
        Solution solution = new Solution();
        int result = solution.maximalSquare(items);
        System.out.println(result);
    }
}