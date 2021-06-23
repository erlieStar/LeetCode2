package com.javashitang.string._647;

/**
 * @author lilimin
 * @since 2021-06-23
 */
class Solution {
    public int countSubstrings(String s) {
        int sum = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (i > j) {
                    continue;
                }
                int start = i;
                int end = j;
                while (start < end && s.charAt(start) == s.charAt(end)) {
                    start++;
                    end--;
                }
                if (start >= end) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
