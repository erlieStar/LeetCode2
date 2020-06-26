package com.javashitang.medium._17_14;

public class Main {

    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        Solution solution = new Solution();
        int[] testArray = {1,3,5,7,2,4,6,8};
        int[] result = solution.smallestK(testArray, 4);
        for (Integer num : result) {
            System.out.println(num);
        }
    }

}
