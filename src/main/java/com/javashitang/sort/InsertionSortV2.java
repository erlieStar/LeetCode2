package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class InsertionSortV2 {

    public static void insertionSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j;
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
        }
    }

}
