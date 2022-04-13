package com.javashitang.medium._9;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int para = x;
        int sum = 0;
        while (x != 0) {
            int temp = x % 10;
            sum = sum * 10 + temp;
            x /= 10;
        }
        return para == sum;
    }
}
