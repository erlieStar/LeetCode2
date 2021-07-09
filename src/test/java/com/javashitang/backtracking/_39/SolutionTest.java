package com.javashitang.backtracking._39;

import org.junit.Test;

import java.nio.channels.SocketChannel;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-09
 */
public class SolutionTest {

    @Test
    public void combinationSum() {
        Solution solution = new Solution();
        int[] array = {2,3,6,7};
        int target = 7;
        List<List<Integer>> lists = solution.combinationSum(array, target);
        System.out.println(lists);
    }

    @Test
    public void combinationSum2() {
        Solution solution = new Solution();
        int[] array = {2,3,5};
        int target = 8;
        List<List<Integer>> lists = solution.combinationSum(array, target);
        System.out.println(lists);
    }
}