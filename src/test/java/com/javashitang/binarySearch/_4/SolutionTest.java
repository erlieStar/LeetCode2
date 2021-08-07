package com.javashitang.binarySearch._4;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class SolutionTest {

    @Test
    public void findMedianSortedArrays() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    @Test
    public void findMedianSortedArrays2() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    @Test
    public void findMedianSortedArrays3() {
        int[] nums1 = {0, 0};
        int[] nums2 = {0, 0};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    @Test
    public void findMedianSortedArrays4() {
        int[] nums1 = {};
        int[] nums2 = {1};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

    @Test
    public void findMedianSortedArrays5() {
        int[] nums1 = {2};
        int[] nums2 = {};
        Solution solution = new Solution();
        double result = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println(result);
    }

}