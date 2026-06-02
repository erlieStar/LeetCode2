package com.javashitang.hard._76;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        Map<Character, Integer> sm = new HashMap<>();
        Map<Character, Integer> tm = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char item = t.charAt(i);
            tm.put(item, tm.getOrDefault(item, 0) + 1);
        }
        return "";
    }
}
