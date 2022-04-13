package com.javashitang.Interview._01_04._2;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canPermutePalindrome(String s) {
        int[] count = new int[128];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int sum = 0;
        for (int i = 0; i < 128; i++) {
            if ((count[i] & 1) == 1) {
                sum++;
            }
        }
        return sum <= 1;
    }
}
