package com.javashitang.sort;

/**
 * @author lilimin
 * @since 2021-08-15
 *
 * https://zhuanlan.zhihu.com/p/87781731
 * https://www.cnblogs.com/chengxiao/p/6104371.html
 */
public class ShellSort {

    public static void shellSort(int[] a) {
        for (int step = a.length / 2; step > 0; step /= 2) {
            for (int i = step; i < a.length; i++) {
                int temp = a[i];
                int j;
                for (j = i - step; j >= 0 && a[j] > temp ; j -= step) {
                    a[j + step] = a[j];
                }
                a[j + step] = temp;
            }
        }
    }
}
