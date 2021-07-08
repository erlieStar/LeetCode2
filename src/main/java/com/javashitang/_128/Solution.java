package com.javashitang._128;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-07-05
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        // 考虑到数组都相等
        int max = 1;
        int cur = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i +1]) {
                cur += 1;
            } else {
                cur = 1;
            }
            if (cur > max) {
                max = cur;
            }
        }
        return max;
    }
}
