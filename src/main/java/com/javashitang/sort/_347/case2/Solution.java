package com.javashitang.sort._347.case2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-08-25
 */
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return quickSort(nums, 0, nums.length - 1, k);
    }

    public int[] quickSort(int[] nums, int left, int right, int k) {
        int index = sort(nums, left, right);
        if (index == k) {
            return Arrays.copyOf(nums, k);
        }
        // 根据 index 和 k 的位置决定切左段还是右段
        return index > k ? quickSort(nums, left, index - 1, k) : quickSort(nums, index + 1, right, k);
    }

    public int sort(int[] a, int left, int right) {
        int key = a[left];
        while (left < right) {
            while (left < right && a[right] >= key) {
                right--;
            }
            a[left] = a[right];
            while (left < right && a[left] <= key) {
                left++;
            }
            a[right] = a[left];
        }
        a[left] = key;
        return left;
    }
}
