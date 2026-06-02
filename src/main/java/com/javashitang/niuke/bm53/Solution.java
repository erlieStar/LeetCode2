package com.javashitang.niuke.bm53;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     */
    public int minNumberDisappeared (int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }
        int index = 1;
        while (index <= Integer.MAX_VALUE) {
            Integer value = map.get(index);
            if (value == null) {
                return index;
            }
            index++;
        }
        return 0;
    }
}
