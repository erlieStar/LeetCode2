package com.javashitang.hashTable.interview.error;

import org.junit.Test;

import java.net.Socket;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class SolutionTest {

    @Test
    public void getMaxOccurChar() {
        Solution solution = new Solution();
        char result = solution.getMaxOccurChar("aaaccc");
        System.out.println(result);
    }

    @Test
    public void getMaxOccurChar2() {
        Solution solution = new Solution();
        char result = solution.getMaxOccurChar("baab");
        System.out.println(result);
    }
}