package com.javashitang.binarySearch._7;

/**
 * @author lilimin
 * @since 2021-06-22
 * 在排序数组中查找元素的第一个和最后一个位置
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftRange = leftRange(nums, target);
        int rightRange = rightRange(nums, target);
        return new int[] {leftRange, rightRange};
    }

    private int rightRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (right < 0 || nums[right] != target) {
            return -1;
        }
        return right;
    }

    private int leftRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        if (left == nums.length || nums[left] != target) {
            return -1;
        }
        return left;
    }
}
