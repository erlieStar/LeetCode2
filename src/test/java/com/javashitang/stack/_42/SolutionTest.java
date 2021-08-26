package com.javashitang.stack._42;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-06-23
 */
public class SolutionTest {

    @Test
    public void trap() {
        Solution solution = new Solution();
        int[] height = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        int trap = solution.trap(height);
        System.out.println(trap);
    }
}