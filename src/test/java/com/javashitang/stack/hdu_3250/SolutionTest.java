package com.javashitang.stack.hdu_3250;

import org.junit.Test;

import java.nio.channels.SocketChannel;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-24
 */
public class SolutionTest {

    @Test
    public void getSum() {
        Solution solution = new Solution();
        int[] heights = {10, 3, 7, 4, 12, 2};
        System.out.println(solution.getSeeLowSum(heights));
    }

    @Test
    public void test2() {
        int[] heights = {3, 1, 2, 1, 4, 1};
        Solution solution = new Solution();
        System.out.println(solution.getSeeLowSum(heights));
    }
}