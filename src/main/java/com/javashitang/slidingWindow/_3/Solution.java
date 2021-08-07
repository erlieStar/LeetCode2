package com.javashitang.slidingWindow._3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-06-24
 * 滑动窗口
 * https://github.com/labuladong/fucking-algorithm/blob/master/%E7%AE%97%E6%B3%95%E6%80%9D%E7%BB%B4%E7%B3%BB%E5%88%97/%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3%E6%8A%80%E5%B7%A7.md
 * https://coolcao.com/2020/04/30/SlidingWindowAlgorithm/
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