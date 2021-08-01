package com.javashitang.dynamic._322;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-08-01
 */
public class SolutionTest {

    @Test
    public void coinChange() {
        Solution solution = new Solution();
        int[] coins = {2};
        int num = solution.coinChange(coins, 3);
        System.out.println(num);
    }
}