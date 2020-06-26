package com.javashitang.medium._220;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2147483647, -2147483647};
        boolean flag = solution.containsNearbyAlmostDuplicate(a, 1, 2147483647);
        System.out.println(flag);
    }
}
