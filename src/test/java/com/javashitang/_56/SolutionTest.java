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
            System.out.println(merge[i][0] + " " + merge[i][1]);
        }
    }

    @Test
    public void test() {
        int[][] intervals = {{1,3}};
        Solution solution = new Solution();
        int[][] merge = solution.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0] + " " + merge[i][1]);
        }
    }

    @Test
    public void test1() {
        int[][] intervals = {{1,2}, {2,3}};
        Solution solution = new Solution();
        int[][] merge = solution.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0] + " " + merge[i][1]);
        }
    }

    @Test
    public void test2() {
        int[][] intervals = {{1,4}, {2,3}};
        Solution solution = new Solution();
        int[][] merge = solution.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0] + " " + merge[i][1]);
        }
    }

    @Test
    public void test3() {
        int[][] intervals = {{1,10}, {2,3}, {4, 5}};
        Solution solution = new Solution();
        int[][] merge = solution.merge(intervals);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(merge[i][0] + " " + merge[i][1]);
        }
    }
}