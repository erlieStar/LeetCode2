package com.javashitang.hashTable._1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-07-29
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numIndexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = numIndexMap.get(target - nums[i]);
            if (index != null && index != i) {
                return new int[] {i, index};
            }
        }
        return new int[] {};
    }
}