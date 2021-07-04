package com.javashitang.dynamic._55;

/**
 * @author lilimin
 * @since 2021-06-25
 */
class Solution {

    public boolean canJump(int[] nums) {
        for (int i = nums.length - 2; i >= 0 ; i--) {
            if (nums[i] == 0) {
                boolean flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] > i - j) {
                        flag = true;
                        i = j;
                    }
                }
                if (!flag) {
                    return false;
                }
            }
        }
        return true;
    }
}
