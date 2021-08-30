package com.javashitang.queue._378;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-27
 */
public class SolutionTest {

    @Test
    public void kthSmallest() {
        int[][] matrix = {{1,5,9}, {10,11,13}, {12,13,15}};
        Solution solution = new Solution();
        int result = solution.kthSmallest(matrix, 8);
        System.out.println(result);
    }
}