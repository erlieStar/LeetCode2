package com.javashitang.binarySearch._75;

/**
 * @author lilimin
 * @since 2021-07-30
 */
class Solution {

    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = 0;
        while (index <= right) {
            if (nums[index] == 0) {
                swap(index, left++, nums);
                index++;
            } else if (nums[index] == 2) {
                swap(index, right--, nums);
            } else {
                index++;
            }
        }
    }

    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
