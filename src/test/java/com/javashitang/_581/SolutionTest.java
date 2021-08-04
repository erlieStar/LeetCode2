package com.javashitang._581;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void findUnsortedSubarray() {
        int[] nums = {2,6,4,8,10,9,15};
        Solution solution = new Solution();
        int num = solution.findUnsortedSubarray(nums);
        System.out.println(num);
    }

    @Test
    public void findUnsortedSubarray2() {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        int num = solution.findUnsortedSubarray(nums);
        System.out.println(num);
    }
}