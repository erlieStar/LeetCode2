package com.javashitang.sort._offer_40.case2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-26
 */
public class SolutionTest {

    @Test
    public void getLeastNumbers() {
        int[] arr = new int[] {3, 2, 1};
        Solution solution = new Solution();
        int[] leastNumbers = solution.getLeastNumbers(arr, 2);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }
    }

    @Test
    public void getLeastNumbers2() {
        int[] arr = new int[] {0, 0, 0, 2, 0, 5};
        Solution solution = new Solution();
        int[] leastNumbers = solution.getLeastNumbers(arr, 0);
        for (int leastNumber : leastNumbers) {
            System.out.println(leastNumber);
        }
    }
}