package com.javashitang.medium._15;

import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int result = binarySort(j + 1, nums, 0 - (nums[i] + nums[j]));
                if (result != -1) {
                    set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], result)));
                }
            }
        }
        return new ArrayList<>(set);
    }

    public int binarySort(int left, int[] nums, int target) {
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return target;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
