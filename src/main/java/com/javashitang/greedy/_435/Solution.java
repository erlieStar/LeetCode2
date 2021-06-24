package com.javashitang.greedy._435;

import java.util.Arrays;

/**
 * @author lilimin
 * @since 2021-06-24
 */
class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        // 按照每个数组的第二个元素升序排序
        Arrays.sort(intervals, (int[] o1 , int[] o2) -> (o1[1] - o2[1]));
        int end = intervals[0][1];
        int sum = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                sum++;
                end = intervals[i][1];
            }
        }
        return  intervals.length - sum;
    }
}

