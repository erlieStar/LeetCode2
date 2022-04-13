package com.javashitang.Interview._08_11._2;

class Solution {
    public int waysToChange(int n) {
        int[] coin = new int[]{25, 10, 5, 1};
        int result[] = new int[n + 1];
        result[0] = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= n; j++) {
                if (j >= coin[i]) {
                    result[j] = (result[j] + result[j - coin[i]]) % 1000000007;
                }
            }
        }
        return result[n];
    }
}
