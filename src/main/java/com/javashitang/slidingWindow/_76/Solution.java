package com.javashitang.slidingWindow._76;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {

    public String minWindow(String s, String t) {
        Map<Character, Integer> subMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char item = t.charAt(i);
            targetMap.put(item, targetMap.getOrDefault(item, 0) + 1);
        }
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int targetLeft = -1, targetRight = -1;
        while (right < s.length()) {
            char item = s.charAt(right);
            subMap.put(item, subMap.getOrDefault(item, 0) + 1);
            while (check(subMap, targetMap)) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    targetLeft = left;
                    targetRight = right;
                }
                char tempItem = s.charAt(left);
                if (targetMap.containsKey(tempItem)) {
                    subMap.put(tempItem, subMap.get(tempItem) - 1);
                }
                left++;
            }
            right++;
        }
        if (targetLeft == -1) {
            return "";
        }
        return s.substring(targetLeft, targetRight + 1);
    }

    public boolean check(Map<Character, Integer> subMap, Map<Character, Integer> targetMap) {
        Set<Map.Entry<Character, Integer>> entries = targetMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > subMap.getOrDefault(entry.getKey(), 0)) {
                return false;
            }
        }
        return true;
    }

}