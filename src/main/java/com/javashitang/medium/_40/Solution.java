package com.javashitang.medium._40;

import java.util.*;

class Solution {

    Set<List<Integer>> result = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> items = new ArrayList<>();
        Arrays.sort(candidates);
        back(candidates, 0, target, items, 0);
        return new ArrayList<>(result);
    }

    public void back(int[] candidates, int cur, int target, List<Integer> items, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(items));
            return;
        }
        if (cur >= candidates.length || target < 0) {
            return;
        }
        items.add(index, candidates[cur]);
        back(candidates, cur + 1, target - candidates[cur], items, index + 1);
        items.remove(index);
        back(candidates, cur + 1, target, items, index);
    }
}
