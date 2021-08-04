package com.javashitang.doublePointer._283.case2;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                if (left != right) {
                    swap(nums, left, right);
                }
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
