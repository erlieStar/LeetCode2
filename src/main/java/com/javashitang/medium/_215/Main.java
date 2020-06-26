package com.javashitang.medium._215;

public class Main {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        Solution solution = new Solution();
        int[] testArray = {3,2,1,5,6,4};
        int num = solution.findKthLargest(testArray, 2);
        System.out.println(num);
    }

    public static void test2() {
        Solution solution = new Solution();
        int[] testArray = {3,2,3,1,2,4,5,5,6};
        int num = solution.findKthLargest(testArray, 4);
        System.out.println(num);
    }
}
