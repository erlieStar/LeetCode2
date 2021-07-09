package com.javashitang.linkedList._2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-09
 */
public class SolutionTest {

    @Test
    public void addTwoNumbers() {
    }

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(list);
        System.out.println(list);
    }

    @Test
    public void getSum() {
        Solution solution = new Solution();
        List<Integer> sum = solution.getSum(Arrays.asList(3, 4, 2), Arrays.asList(4, 6, 5));
        System.out.println(sum);
    }

    @Test
    public void getSum2() {
        Solution solution = new Solution();
        List<Integer> sum = solution.getSum(Arrays.asList(9, 4, 2), Arrays.asList(9, 4, 6, 5));
        System.out.println(sum);
    }

    @Test
    public void getSum3() {
        Solution solution = new Solution();
        List<Integer> sum = solution.getSum(Arrays.asList(2, 4, 9), Arrays.asList(5, 6, 4, 9));
        System.out.println(sum);
    }
}