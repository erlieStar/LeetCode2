package com.javashitang.recursion._70.case3;

/**
 * @author lilimin
 * @since 2021-08-08
 */
class Solution {

    // 数组大小按照题目的n确定
    int[] visit = new int[100];

    public int climbStairs(int n) {
        if (visit[n] != 0) {
            return visit[n];
        }
        if (n == 1 || n == 2) {
            return n;
        }
        visit[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return visit[n];
    }

}
