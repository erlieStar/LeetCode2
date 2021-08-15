package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class SelectionSortTest {

    @Test
    public void selectionSort() {
        int[] a = {3, 7, 4, 2 ,1};
        SelectionSort.selectionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}