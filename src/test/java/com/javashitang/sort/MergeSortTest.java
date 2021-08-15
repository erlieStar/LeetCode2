package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class MergeSortTest {

    @Test
    public void mergeSort() {
        int[] a = {5, 4, 3, 2, 1};
        MergeSort.mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void mergeSort2() {
        int[] a = {1, 2, 3, 4, 5};
        MergeSort.mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}