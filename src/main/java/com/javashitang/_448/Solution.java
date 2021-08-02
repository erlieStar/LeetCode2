package com.javashitang._448;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-02
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] sign = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sign[nums[i]] = 1;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < sign.length; i++) {
            if (sign[i] == 0) {
                result.add(i);
            }
        }
        return result;
    }
}
