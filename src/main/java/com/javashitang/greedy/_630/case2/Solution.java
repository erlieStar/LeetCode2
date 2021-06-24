package com.javashitang.greedy._630.case2;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {
    public int scheduleCourse(int[][] courses) {
        for (int i = 0; i < courses.length; i++) {
            courses[i][0] = courses[i][1] - courses[i][0];
        }
        // 按照一纬数组的最后一个元素升序排序
        Arrays.sort(courses,(a, b) -> a[1] - b[1]);
        int end = 0;
        int sum = 0;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i][0] > end) {
                end = courses[i][1];
                sum++;
            }
        }
        return sum;
    }
}