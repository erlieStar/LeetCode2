package com.javashitang._56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-08-04
 */
class Solution {

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int left = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > intervals[i - 1][1]) {
                System.out.println(i);
                list.add(new int[]{left, intervals[i - 1][1]});
                if (i + 1 < intervals.length) {
                    left = intervals[i + 1][0];
                }
            }
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i][0] = list.get(i)[0];
            result[i][1] = list.get(i)[1];
        }
        return result;
    }
}