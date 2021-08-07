package com.javashitang.slidingWindow._3.case2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
        int max = 0;
        Map<Character, Integer> numMap = new HashMap<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char item = s.charAt(right);
            numMap.put(item, numMap.getOrDefault(item, 0) + 1);
            while (numMap.get(item) > 1) {
                char tempItem = s.charAt(left);
                numMap.put(tempItem, numMap.get(tempItem) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
            right++;
        }
        return max;
    }
}