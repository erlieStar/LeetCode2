package com.javashitang.medium._46._2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backTracking(nums, result, 0);
        return result;
    }

    public void backTracking(int[] nums, List<List<Integer>> result, int cur) {
        if (cur == nums.length) {
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
            result.add(list);
            return;
        }
        for (int i = cur; i < nums.length; i++) {
            swap(nums, cur, i);
            backTracking(nums, result, cur + 1);
            swap(nums, cur, i);
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
