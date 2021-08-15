package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] a = {3, 7, 4, 2 ,1};
        InsertionSort.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    @Test
    public void insertionSortV2() {
        int[] a = {7, 6, 5, 4, 3};
        InsertionSort.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}