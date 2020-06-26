package com.javashitang.medium._215;


public class Solution2 {

    public int findKthLargest(int[] nums, int k) {
        return quickSort(nums, 0, nums.length, k);
    }

    public static int quickSort(int[] a, int low, int high, int k) {
        if (low < high) {
            int key = sort(a, low, high);
            if (key == k) {
                return a[key];
            } else if (key > k) {
                return quickSort(a, low, key - 1, k);
            } else {
                return quickSort(a, key + 1, high, k);
            }
        }
        return 0;
    }

    public static int sort(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] >= key) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

}
