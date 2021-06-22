package com.javashitang.binarySearch._5;

/**
 * @author lilimin
 * @since 2021-06-21
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < max){
                return i - 1;
            }
        }
        return nums.length - 1;
    }
}