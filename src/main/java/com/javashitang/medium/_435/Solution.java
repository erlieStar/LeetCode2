package com.javashitang.medium._435;

import java.util.Arrays;

public class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, (int[] o1 ,int[] o2) -> (o1[1] - o2[1]));
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
