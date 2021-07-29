package com.javashitang.binarySearch._33;

/**
 * @author lilimin
 * @since 2021-06-28
 * https://blog.csdn.net/zhangbaoanhadoop/article/details/80036931
 */
class Solution {

    public int search(int[] nums, int target) {
        return 0;
    }

    public int binarySearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
