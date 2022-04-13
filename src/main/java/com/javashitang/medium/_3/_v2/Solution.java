package com.javashitang.medium._3._v2;

import java.util.Arrays;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int[] visit = new int[128];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(visit, 0);
            boolean flag = true;
            for (int j = i; j < s.length(); j++) {
                if (visit[s.charAt(j)] == 0) {
                    visit[s.charAt(j)] = 1;
                } else {
                    max = Math.max(max, j - i);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                max = Math.max(max, s.length() - i);
            }
        }
        return max;
    }
}
