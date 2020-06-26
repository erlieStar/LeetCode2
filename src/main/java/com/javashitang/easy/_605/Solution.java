package com.javashitang.easy._605;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum = 0;
        for (int i = 0; i < flowerbed.length && sum < n; i++) {
            if (flowerbed[i] == 0) {
                int pre = i == 0 ? 0 : flowerbed[i - 1];
                int after = i == flowerbed.length - 1 ? 0 : flowerbed[i + 1];
                if (pre + after == 0) {
                    flowerbed[i] = 1;
                    sum++;
                }
            }
        }
        return sum == n;
    }
}
