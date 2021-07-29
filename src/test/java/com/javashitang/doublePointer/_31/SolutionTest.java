package com.javashitang.doublePointer._31;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-29
 */
public class SolutionTest {

    @Test
    public void nextPermutation() {
        Solution solution = new Solution();
        int[] num = {1, 2, 3};
        solution.nextPermutation(num);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}