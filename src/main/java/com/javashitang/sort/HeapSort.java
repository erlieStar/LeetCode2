package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 *
 * https://www.cnblogs.com/chengxiao/p/6129630.html
 *
 * https://www.bilibili.com/video/BV1Eb41147dK/
 */
public class HeapSort {

    public static void heapSort(int[] a) {
        buildTree(a);
        for (int i = a.length - 1; i >= 0; i--) {
            swap(a, i, 0);
            heapify(a, i);
        }
    }

    public static void buildTree(int[] a) {
        int lastNode = a.length - 1;
        int parent = (lastNode - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(a, i);
        }
    }

    public static void heapify(int[] a, int i) {
        if (i >= a.length) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < a.length && a[c1] > a[max]) {
            max = c1;
        }
        if (c2 < a.length && a[c2] > a[max]) {
            max = c2;
        }
        if (max != i) {
            swap(a, max ,i);
            heapify(a, max);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
