package com.javashitang._128;

import org.junit.Test;

import java.nio.channels.SocketChannel;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-05
 */
public class SolutionTest {

    @Test
    public void longestConsecutive() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 0 , 1};
        System.out.println(solution.longestConsecutive(nums));
    }

    @Test
    public void longestConsecutive2() {
        Solution solution = new Solution();
        int[] nums = {0, 0};
        System.out.println(solution.longestConsecutive(nums));
    }
}