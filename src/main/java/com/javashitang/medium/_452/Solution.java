package com.javashitang.medium._452;

import java.util.Arrays;

public class Solution {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, (int[] o1 ,int[] o2) -> (o1[1] - o2[1]));
        int end = points[0][1];
        int sum = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                sum++;
                end = points[i][1];
            }
        }
        return sum;
    }
}
