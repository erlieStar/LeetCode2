package com.javashitang.medium._287;

class Solution {
    public int findDuplicate(int[] nums) {
        int[] visit = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            visit[nums[i]]++;
            if (visit[nums[i]] > 1) {
                return nums[i];
            }
        }
        return 0;
    }
}
