package com.javashitang._560;

import org.junit.Test;

import java.nio.channels.SocketChannel;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-09
 */
public class SolutionTest {

    @Test
    public void subarraySum() {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1};
        int result = solution.subarraySum(nums, 2);
        System.out.println(result);
    }

    @Test
    public void subarraySum2() {
        Solution solution = new Solution();
        int[] nums = {5};
        int result = solution.subarraySum(nums, 5);
        System.out.println(result);
    }
}