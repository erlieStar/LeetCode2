package com.javashitang.Interview.three;

public class Solution {

    boolean flag = false;
    int[] finalresult = new int[]{};

    public int[] getAnswer(int[] nums, int n, int target) {
        int[] result = new int[n];
        back(nums, target, 0, n, result, 0);
        return finalresult;
    }

    public void back(int[] nums, int target ,int cur, int n, int[] result, int index) {
        if (flag) {
            return;
        }
        if (cur >= nums.length) {
            return;
        }
        if (index >= n) {
            if (target == 0) {
                flag = true;
                finalresult = result;
            }
            return;
        }
        result[index] = nums[cur];
        back(nums, target - nums[cur], cur + 1, n, result, index + 1);
        back(nums, target, cur + 1, n, result, index);
    }
}
