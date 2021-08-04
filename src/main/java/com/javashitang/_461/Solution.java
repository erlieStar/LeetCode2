package com.javashitang._461;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public int hammingDistance(int x, int y) {
        int sum = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                sum++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return sum;
    }
}
