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
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0 || intervals[i][0] > list.get(list.size() - 1)[1]) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                int right[] = list.get(list.size() - 1);
                right[1] = Math.max(right[1], intervals[i][1]);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}