package com.javashitang.binarySearch._2;

/**
 * @author lilimin
 * @since 2021-06-21
 * x 的平方根
 */
class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid < mid) {
                right = mid - 1;
            } else if (x / mid > mid) {
                left = mid + 1;
            }
        }
        return right;
    }
}