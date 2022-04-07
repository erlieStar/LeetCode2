package com.javashitang.medium._621;

import java.util.Arrays;

class Solution {

    public int leastInterval(char[] tasks, int n) {
        int[] visit = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            visit[tasks[i] - 'A']++;
        }
        Arrays.sort(visit);
        int sum = 0;
        for (int i = 24; i >=0 ; i--) {
            if (visit[i] < visit[25]) {
                break;
            } else {
                sum++;
            }
        }
        return Math.max(visit[25] + (visit[25] - 1) * n + sum, tasks.length);
    }
}
