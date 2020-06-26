package com.javashitang.hard._982;

public class Solution {
    public int countTriplets(int[] A) {
        int count = 0;
        int[] resultMap = new int[1 << 16];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                resultMap[A[i] & A[j]]++;
            }
        }
        for (int i = 0; i < resultMap.length; i++) {
            if (resultMap[i] == 0) {
                continue;
            }
            for (int j = 0; j < A.length; j++) {
                if ((i & A[j]) == 0) {
                    count += resultMap[i];
                }
            }
        }
        return count;
    }
}
