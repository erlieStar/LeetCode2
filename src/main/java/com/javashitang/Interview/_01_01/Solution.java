package com.javashitang.Interview._01_01;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isUnique(String astr) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < astr.length(); i++) {
            boolean flag = set.add(astr.charAt(i));
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
