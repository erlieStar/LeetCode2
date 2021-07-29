package com.javashitang.doublePointer._31;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-30
 *
 * 1 1 2
 * 1 2 1
 *
 * 2 3 4
 * 3 2 4
 *
 * [1,2,3]
 * [1,3,2]
 *
 * [1,1,5]
 * [1,5,1]
 *
 * [3,2,1]
 * [1,2,3]
 */
class Solution {

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int target = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i] && nums[j] < min) {
                    min = nums[j];
                    target = j;
                }
            }
            if (min != Integer.MAX_VALUE) {
                swap(i, target, nums);
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
        }
        // 没有移动，说明数组倒序排列，升序即可
        Arrays.sort(nums);
    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
