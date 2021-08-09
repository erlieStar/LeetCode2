package com.javashitang.recursion._70.case2;

/**
 * @author lilimin
 * @since 2021-08-08
 */
class Solution {

    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

}
