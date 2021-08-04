package com.javashitang._3.case2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            Integer index = map.get(item);
            if (index != null) {
                left = index;
            }
            map.put(item, i);
        }
        return max;
    }
}

