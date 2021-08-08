package com.javashitang.bit._231;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}