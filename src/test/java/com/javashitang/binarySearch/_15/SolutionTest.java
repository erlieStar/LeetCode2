package com.javashitang.binarySearch._15;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-29
 */
public class SolutionTest {

    @Test
    public void threeSum() {
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    @Test
    public void threeSum2() {
        Solution solution = new Solution();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = solution.threeSum(nums);
        System.out.println(lists);
    }
}