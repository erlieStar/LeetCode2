package com.javashitang.backtracking._494;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-07-31
 */
public class SolutionTest {

    @Test
    public void findTargetSumWays() {
        int[] array = {1, 1, 1, 1, 1};
        Solution solution = new Solution();
        int sum = solution.findTargetSumWays(array, 3);
        System.out.println(sum);
    }
}