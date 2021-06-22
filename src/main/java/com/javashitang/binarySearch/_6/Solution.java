package com.javashitang.binarySearch._6;

/**
 * @author lilimin
 * @since 2021-06-22
 */
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == 0) {
                return nums[mid];
            }
            if (nums[mid - 1] < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid - 1] > nums[mid]) {
                left = mid + 1;
            }
        }
        return nums[right];
    }
}
