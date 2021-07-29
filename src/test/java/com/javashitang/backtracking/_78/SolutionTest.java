package com.javashitang.backtracking._78;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-29
 */
public class SolutionTest {

    @Test
    public void subsets() {
        Solution solution = new Solution();
        int[] array = {1,2,3};
        List<List<Integer>> result = solution.subsets(array);
        System.out.println(result);
        System.out.println(result.size());
    }

    @Test
    public void subsets2() {
        Solution solution = new Solution();
        int[] array = {0};
        List<List<Integer>> result = solution.subsets(array);
        System.out.println(result);
        System.out.println(result.size());
    }
}