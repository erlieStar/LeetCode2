package com.javashitang.backtracking._39;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-04
 */
class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtracking(candidates, target, resultList);
        return resultList;
    }

    public void backtracking(int[] candidates, int target, List<List<Integer>> resultList) {

    }
}
