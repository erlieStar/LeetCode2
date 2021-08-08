package com.javashitang.bit._191;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class Solution {

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
