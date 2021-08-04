package com.javashitang._56;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-04
 */
public class SolutionTest {

    @Test
    public void merge() {
        int[][] intervals = {{2,6}, {1,3}, {8,10}, {15,18}};
        Solution solution = new Solution();
        int[][] merge = solution.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0]);
        }
    }

    @Test
    public void test() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        for (int[] ints : list) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }
}