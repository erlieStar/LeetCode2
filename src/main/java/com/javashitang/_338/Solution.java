package com.javashitang._338;

/**
 * @author lilimin
 * @since 2021-08-02
 */
class Solution {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num & 1;
                num = num >> 1;
            }
            result[i] = sum;
        }
        return result;
    }
}
