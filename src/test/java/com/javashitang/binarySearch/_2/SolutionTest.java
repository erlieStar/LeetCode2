package com.javashitang.binarySearch._2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-21
 */
public class SolutionTest {

    @Test
    public void mySqrt() {
        Solution solution = new Solution();
//        System.out.println(solution.mySqrt(4));
        System.out.println(solution.mySqrt(8));
    }

    @Test
    public void test1() {
        int start = 1;
        int end = 3;
        int mid = start + (end - start) >> 1;
        System.out.println(mid);
        mid = (start + end) >> 1;
        System.out.println(mid);
        mid = start + (end - start) / 2;
        System.out.println(mid);
    }
}