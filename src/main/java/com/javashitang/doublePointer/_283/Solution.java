package com.javashitang.doublePointer._283;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] == 0) {
                for (int i = left + 1; i <= right; i++) {
                    if (nums[i] != 0) {
                        swap(nums, left, i);
                        break;
                    }
                }
                left++;
            } else {
                left++;
            }
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
