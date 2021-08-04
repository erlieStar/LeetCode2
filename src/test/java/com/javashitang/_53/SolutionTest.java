package com.javashitang._53;

import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void maxSubArray() {
        int[] array = {-2, -1};
        Solution solution = new Solution();
        int i = solution.maxSubArray(array);
        System.out.println(i);
    }
}