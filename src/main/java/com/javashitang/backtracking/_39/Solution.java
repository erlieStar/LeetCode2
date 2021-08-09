package com.javashitang.backtracking._39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-04
 *
 * 组合
 */
class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtracking(0, 0, candidates, target, currentList, resultList);
        return resultList;
    }

    public void backtracking(int listIndex, int nexIndex, int[] candidates, int target, List<Integer> currentList, List<List<Integer>> resultList) {
        int sum = currentList.stream().mapToInt(Integer::intValue).sum();
        if (sum > target) {
            return;
        }
        if (sum == target) {
            List<Integer> itemList = new ArrayList<>(currentList);
            resultList.add(itemList);
            return;
        }
        for (int i = nexIndex; i < candidates.length; i++) {
            currentList.add(listIndex, candidates[i]);
            backtracking(listIndex + 1, i, candidates, target, currentList, resultList);
            currentList.remove(listIndex);
        }
    }
}
