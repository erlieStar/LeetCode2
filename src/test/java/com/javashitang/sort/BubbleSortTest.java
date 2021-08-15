package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] a = {3, 7, 4, 2 ,1};
        BubbleSort.bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}