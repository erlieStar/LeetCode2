package com.javashitang.medium._7;

class Solution {

    long min = (long) (Math.pow(2, 31) * -1);
    long max = (long) (Math.pow(2, 31) - 1);

    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            long tail = x % 10;
            result = result * 10 + tail;
            x /= 10;
        }
        if (result < min || result > max) {
            return 0;
        }
        return (int) result;
    }
}
