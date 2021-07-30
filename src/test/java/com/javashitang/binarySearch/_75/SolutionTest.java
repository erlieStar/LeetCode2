package com.javashitang.binarySearch._75;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-07-30
 */
public class SolutionTest {

    @Test
    public void sortColors() {
        Solution solution = new Solution();
        int[] nums = {2,0,2,1,1,0};
        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }

    @Test
    public void sortColors2() {
        Solution solution = new Solution();
        int[] nums = {2,0,1};
        solution.sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}