package com.javashitang._581;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int[] sortNums = new int[nums.length];
        System.arraycopy(nums, 0, sortNums, 0, nums.length);
        Arrays.sort(sortNums);
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == sortNums[i]) {
                left++;
            } else {
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == sortNums[i]) {
                right--;
            } else {
                break;
            }
        }
        int num = right - left + 1;
        if (num < 0) {
            num = 0;
        }
        return num;
    }
}
