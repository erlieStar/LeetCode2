package com.javashitang.doublePointer._11;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-09
 */
public class SolutionTest {

    @Test
    public void maxArea() {
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int i = solution.maxArea(height);
        System.out.println(i);
    }
}