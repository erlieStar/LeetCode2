package com.javashitang.hashTable.interview;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class SolutionTest {

    @Test
    public void getMaxOccurChar() {
        Solution solution = new Solution();
        char result = solution.getMaxOccurChar("aaaahfdfbbbb");
        System.out.println(result);
    }
}