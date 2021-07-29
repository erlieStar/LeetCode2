package com.javashitang.doublePointer._31;

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
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    swap(i, j, nums);
                    return;
                }
            }
        }
        // 没有移动，说明数组倒序排列
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            swap(left, right, nums);
            left++;
            right--;
        }
    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
