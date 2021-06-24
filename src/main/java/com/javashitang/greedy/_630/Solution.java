package com.javashitang.greedy._630;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {
    public int scheduleCourse(int[][] courses) {
        // 按照一维数组的第二个元素升序排序
        Arrays.sort(courses,(a, b) -> a[1] - b[1]);
        int end = courses[0][1];
        int sum = 1;
        for (int i = 1; i < courses.length; i++) {
            if (courses[i][0] > end) {
                end = courses[i][1];
                sum++;
            }
        }
        return sum;
    }
}