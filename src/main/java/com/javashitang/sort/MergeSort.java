package com.javashitang.sort;


/**
 * @author lilimin
 * @since 2021-08-14
 */
public class MergeSort {

    public static int[] sort(int[] src, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(src, left, mid);
            sort(src, mid + 1, right);
            merge(src, left, mid, right);
        }
        return src;
    }

    public static void merge(int[] src, int left, int mid, int right) {

    }
}

