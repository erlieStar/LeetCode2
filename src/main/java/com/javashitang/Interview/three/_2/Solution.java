package com.javashitang.Interview.three._2;

public class Solution {

    static int[] finalresult = new int[]{};

    public static void main(String[] args) {
        int[] temp = {1, 2, 3, 4};
        finalresult = temp;
        for (int i = 0; i < finalresult.length; i++) {
            System.out.println(finalresult[i]);
        }
    }
}
