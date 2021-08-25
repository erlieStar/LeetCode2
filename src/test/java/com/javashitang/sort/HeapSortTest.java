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

    @Test
    public void heapify() {
        int[] array = new int[]{4, 10, 3, 5 , 1, 2};
        HeapSort.heapify(array, array.length,0);
        for (int i : array) {
            System.out.println(i);
        }
    }


    @Test
    public void buildTree() {
        int[] array = new int[]{3, 5, 7, 2, 4, 9, 6};
        HeapSort.buildTree(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    public void buildTree2() {
        int[] array = new int[]{5, 4, 3 ,2, 1};
        HeapSort.buildTree(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}