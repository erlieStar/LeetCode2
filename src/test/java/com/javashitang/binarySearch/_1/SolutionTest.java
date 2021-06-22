package com.javashitang.binarySearch._1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-22
 */
public class SolutionTest {

    @Test
    public void search() {
        int[] nums = {3,4,5,1,2};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 4));
        System.out.println(solution.search(nums, 10));
    }

    @Test
    public void search2() {
        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        System.out.println(solution.search(nums, 4));
    }

    @Test
    public void leftSearch() {
        int[] nums = {1,2,3,4,4,4,4,5,7};
        Solution solution = new Solution();
        System.out.println(solution.leftSearch(nums, 4));
        System.out.println(solution.leftSearch(nums, 10));
    }


    @Test
    public void rightSearch() {
        int[] nums = {1,2,3,4,4,4,4,5,7};
        Solution solution = new Solution();
        System.out.println(solution.rightSearch(nums, -10));
        System.out.println(solution.rightSearch(nums, 4));
        System.out.println(solution.rightSearch(nums, 3));
    }
}