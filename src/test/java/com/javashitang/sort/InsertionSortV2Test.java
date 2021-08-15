package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class InsertionSortV2Test {

    @Test
    public void insertionSort() {
        int[] a = {7, 6, 5, 4, 3};
        InsertionSortV2.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    @Test
    public void insertionSortV2() {
        int[] a = {1, 2, 3, 4, 5};
        InsertionSortV2.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}