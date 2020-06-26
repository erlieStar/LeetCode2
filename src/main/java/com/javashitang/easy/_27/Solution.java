package com.javashitang.easy._27;

public class Solution {

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public int removeElement(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != val) {
                        swap(nums, i, j);
                        break;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                break;
            }
            count++;
        }
        return count;
    }
}
