package com.javashitang.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-15
 */
public class ShellSortTest {

    @Test
    public void shellSort() {
        int[] a = {7, 6, 5, 4, 3};
        ShellSort.shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}