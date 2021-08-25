package com.javashitang.sort._offer_40;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-25
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
}