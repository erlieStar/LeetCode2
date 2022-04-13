package com.javashitang.Interview._08_11;

class Solution {
    public int waysToChange(int n) {
        int sum = 0;
        for (int i = 0; i <= 40000; i++) {
            if (i * 25 > n) {
                break;
            }
            for (int j = 0; j <= 100000; j++) {
                if (i * 25 + j * 10 > n) {
                    break;
                }
                for (int k = 0; k <= 200000; k++) {
                    if (i * 25 + j * 10 + k * 5 > n) {
                        break;
                    }
                    sum++;
                }
            }
        }
        return sum;
    }
}
