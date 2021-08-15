package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class CountingSortTest {

    @Test
    public void countingSort() {
        int[] a = {5, 4, 3, 2, 1};
        CountingSort.countingSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}