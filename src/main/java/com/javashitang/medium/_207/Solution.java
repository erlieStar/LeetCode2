package com.javashitang.medium._207;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];
        for (int[] item : prerequisites) {
            in[item[0]]++;
        }
        int sum = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                sum++;
                queue.add(i);
            }
        }
        if (queue.isEmpty()) {
            return false;
        }
        while (!queue.isEmpty()) {
            Integer course = queue.poll();
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == course) {
                    in[prerequisite[0]]--;
                    if (in[prerequisite[0]] == 0) {
                        sum++;
                        queue.add(prerequisite[0]);
                    }
                }
            }
        }
        return sum == numCourses;
    }
}