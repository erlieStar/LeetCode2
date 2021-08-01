package com.javashitang._169;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-08-01
 */
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
