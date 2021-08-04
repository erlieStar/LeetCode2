package com.javashitang._3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            set.clear();
            int right = i;
            char item;
            while (right < s.length() && !set.contains(item = s.charAt(right))) {
                set.add(item);
                right++;
            }
            max = Math.max(max, set.size());
        }
        return max;
    }
}

