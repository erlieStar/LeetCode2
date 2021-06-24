package com.javashitang.greedy._630.case2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-24
 */
public class SolutionTest {

    @Test
    public void scheduleCourse() {
        Solution solution = new Solution();
        int[][] courses = {{3, 2}, {4, 3}};
        System.out.println(solution.scheduleCourse(courses));
    }
}