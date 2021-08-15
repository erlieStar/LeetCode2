package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class CountingSortV2 {

    public static void countingSort(int[] a) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : a) {
            max = Integer.max(max, num);
            min = Integer.min(min, num);
        }
        int[] count = new int[max - min + 1];
        for (int num : a) {
            count[num - min]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                a[index++] = i + min;
                count[i]--;
            }
        }
    }
}
