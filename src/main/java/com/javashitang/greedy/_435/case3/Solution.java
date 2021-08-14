package com.javashitang.greedy._435.case3;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        // 按照每个数组的第二个元素升序排序
        Arrays.sort(intervals, (a, b) -> (a[1] - b[1]));
        int end = intervals[0][1];
        int sum = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                sum++;
                end = intervals[i][1];
            }
        }
        return sum;
    }
}

