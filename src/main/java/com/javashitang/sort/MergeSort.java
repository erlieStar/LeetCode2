package com.javashitang.sort;


/**
 * @author lilimin
 * @since 2021-08-14
 */
public class MergeSort {

    public static void mergeSort(int[] a, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        merge(a, left, mid, right);
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // 复制左边数组剩余的值
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 复制右边数组剩余的值
        while (j <= right) {
            temp[k++] = a[j++];
        }
        int index = 0;
        while (left <= right) {
            a[left++] = temp[index++];
        }
    }
}

