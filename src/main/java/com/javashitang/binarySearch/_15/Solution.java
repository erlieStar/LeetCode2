package com.javashitang.binarySearch._15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-07-29
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int target = 0 - (nums[i] + nums[j]);
                int index = binarySearch(j + 1, nums, target);
                if (index != -1) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[index]));
                }
            }
        }
        return new ArrayList<>(set);
    }

    public int binarySearch(int left, int[] nums, int target) {
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
