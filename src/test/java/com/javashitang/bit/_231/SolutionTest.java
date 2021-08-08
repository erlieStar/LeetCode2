package com.javashitang.bit._231;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class SolutionTest {

    @Test
    public void isPowerOfTwo() {
        Solution solution = new Solution();
        System.out.println(Integer.MAX_VALUE);
        boolean result = solution.isPowerOfTwo(-2147483648);
        System.out.println(result);
    }
}