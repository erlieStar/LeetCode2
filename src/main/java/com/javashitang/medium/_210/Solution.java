package com.javashitang.medium._210;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] result = new int[numCourses];
        int[] in = new int[numCourses];
        for (int[] item : prerequisites) {
            in[item[0]]++;
        }
        int cur = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                result[cur++] = i;
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            Integer course = queue.poll();
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[1] == course) {
                    in[prerequisite[0]]--;
                    if (in[prerequisite[0]] == 0) {
                        result[cur++] = prerequisite[0];
                        queue.add(prerequisite[0]);
                    }
                }
            }
        }
        return cur == numCourses ? result : new int[] {};
    }
}
