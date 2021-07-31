package com.javashitang.backtracking._494;

/**
 * @author lilimin
 * @since 2021-07-31
 */
class Solution {

    int total = 0;

    public int findTargetSumWays(int[] nums, int target) {
        backtracking(nums, target, 0, 0);
        return total;
    }

    public void backtracking(int[] nums, int target, int curIndex, int sum) {
        if (curIndex == nums.length) {
            if (sum == target) {
                total++;
            }
            return;
        }
        backtracking(nums, target, curIndex + 1, sum + nums[curIndex]);
        backtracking(nums, target, curIndex + 1, sum - nums[curIndex]);
    }
}
