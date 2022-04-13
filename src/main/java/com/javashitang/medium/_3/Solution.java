package com.javashitang.medium._3;

import java.util.Arrays;

class Solution {
    /**
     * 错误代码
     * dvdf 应该是3，结果是2
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] visit = new int[128];
        int left = 0;
        int right = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (visit[s.charAt(i)] == 0) {
                visit[s.charAt(i)] = 1;
                right = i;
            } else {
                max = Math.max(max, right - left + 1);
                left = i;
                right = i;
                Arrays.fill(visit, 0);
                visit[s.charAt(i)] = 1;
            }
        }
        return Math.max(max, right - left + 1);
    }
}
