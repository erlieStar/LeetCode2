package com.javashitang.stack._84;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-26
 */
public class SolutionTest {

    @Test
    public void largestRectangleArea() {
        Solution solution = new Solution();
        int[] heights = new int[] {2,1,5,6,2,3};
        int result = solution.largestRectangleArea(heights);
        System.out.println(result);
    }
}