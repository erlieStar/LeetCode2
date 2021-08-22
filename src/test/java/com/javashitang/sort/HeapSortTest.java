package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class HeapSortTest {

    @Test
    public void heapSort() {
        int[] array = new int[]{5, 4, 3 ,2, 1};
        HeapSort.heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}