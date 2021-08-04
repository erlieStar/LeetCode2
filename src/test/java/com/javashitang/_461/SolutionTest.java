package com.javashitang._461;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void hammingDistance() {
        Solution solution = new Solution();
        int sum = solution.hammingDistance(1, 4);
        System.out.println(sum);
    }
}