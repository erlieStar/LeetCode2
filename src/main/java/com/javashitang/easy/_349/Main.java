package com.javashitang.easy._349;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1};
        Solution solution = new Solution();
        int[] num3 = solution.intersection(num1, num2);
        System.out.println(Arrays.toString(num3));
    }
}