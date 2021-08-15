package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class BasicSort {

    public static void basicSort(int[] a) {
        int max = 0;
        for (int num : a) {
            max = Math.max(max, num);
        }
        int time = 0;
        while (max > 0) {
            max = max /= 10;
            time++;
        }
    }
}
