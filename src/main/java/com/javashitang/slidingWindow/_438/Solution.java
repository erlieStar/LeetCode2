package com.javashitang.slidingWindow._438;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-08-06
 */
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> results = new ArrayList<>();
        Map<Character, Integer> subMap = new HashMap<>();
        Map<Character, Integer> targetMap = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char item = p.charAt(i);
            targetMap.put(item, targetMap.getOrDefault(item, 0 ) + 1);
        }
        int left = 0, right = 0;
        while (right < s.length()) {
            char item = s.charAt(right);
            subMap.put(item, subMap.getOrDefault(item, 0) + 1);
            if  (right - left + 1 == p.length()) {
                if (check(subMap, targetMap)) {
                    results.add(left);
                }
                left++;
            }
            right++;
        }
        return results;
    }

    public boolean check(Map<Character, Integer> subMap, Map<Character, Integer> targetMap) {
        Set<Map.Entry<Character, Integer>> entries = targetMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue().equals(subMap.getOrDefault(entry.getKey(), 0))) {
                return false;
            }
        }
        return true;
    }
}
