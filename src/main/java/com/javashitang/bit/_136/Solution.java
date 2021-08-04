package com.javashitang.bit._136;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
        }
        return sum;
    }
}