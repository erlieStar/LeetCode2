package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class CountingSort {

    public static void countingSort(int[] a) {
        int max = Integer.MIN_VALUE;
        for (int num : a) {
            max = Integer.max(max, num);
        }
        int[] count = new int[max + 1];
        for (int num : a) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[index++] = i;
                count[i]--;
            }
        }
    }
}
