package com.javashitang.backtracking._78;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-29
 *
 * 组合
 */
class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        resultList.add(new ArrayList<>());
        backtracking(resultList, new ArrayList<>(), nums, 0, 0);
        return resultList;
    }

    public void backtracking(List<List<Integer>> resultList, List<Integer> curList, int[] nums, int curIndex, int numIndex) {
        if (curIndex == nums.length) {
            return;
        }
        for (int i = numIndex; i < nums.length; i++) {
            curList.add(curIndex, nums[i]);
            resultList.add(new ArrayList<>(curList));
            backtracking(resultList, curList, nums,  curIndex + 1, i + 1);
            curList.remove(curIndex);
        }
    }
}
