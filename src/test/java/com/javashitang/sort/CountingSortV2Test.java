package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class CountingSortV2Test {

    @Test
    public void countingSort() {
        int[] a = {100000003, 100000002, 100000001};
        CountingSortV2.countingSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void countingSort2() {
        int[] a = {5, 4, 3, 2, 1};
        CountingSortV2.countingSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}