package com.javashitang.hashTable._128;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-08-22
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int sum = 1;
                while (set.contains(++num)) {
                    sum++;
                }
                max = Math.max(sum, max);
            }
        }
        return max;
    }
}
