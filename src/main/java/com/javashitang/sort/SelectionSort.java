package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class SelectionSort {

    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int index = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[index] > a[j]) {
                    index = j;
                }
            }
            if (index != i) {
                swap(a, index, i);
            }
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
