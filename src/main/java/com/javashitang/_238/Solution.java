package com.javashitang._238;

/**
 * @author lilimin
 * @since 2021-08-01
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = num;
            num *= nums[i];
        }
        num = 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            suffix[i] = num;
            num *= nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            prefix[i] *= suffix[i];
        }
        return prefix;
    }
}
