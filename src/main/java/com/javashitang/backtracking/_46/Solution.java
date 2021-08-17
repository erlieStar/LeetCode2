package com.javashitang.backtracking._46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-17
 *
 * 全排列
 */
class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> items = new ArrayList<>();
        backtracking(nums, items, 0);
        return result;
    }

    public void backtracking(int[] nums, List<Integer> items, int cur) {
        if (cur == nums.length) {
            result.add(new ArrayList<>(items));
        }
        for (int i = 0; i < nums.length; i++) {
            if (!items.contains(nums[i])) {
                items.add(nums[i]);
                backtracking(nums, items, cur + 1);
                items.remove(items.size() - 1);
            }
        }
    }
}