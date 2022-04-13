package com.javashitang.Interview._01_04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean canPermutePalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer value = map.putIfAbsent(s.charAt(i), 1);
            if (value != null) {
                map.put(s.charAt(i), value + 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if ((entry.getValue() & 1) == 1) {
                sum++;
            }
        }
        if (sum == 1 || sum == 0) {
            return true;
        }
        return false;
    }
}
