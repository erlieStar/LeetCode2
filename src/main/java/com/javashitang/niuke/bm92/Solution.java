package com.javashitang.niuke.bm92;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int maxLength (int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = 0;
        Map<Integer, Integer> visit = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            visit.clear();
            int j;
            for (j = i; j < arr.length;) {
                if (visit.get(arr[j]) == null) {
                    visit.put(arr[j], 1);
                    j++;
                } else {
                    max = Math.max(max, j - i);
                    break;
                }
            }
            if (j == arr.length) {
                max = Math.max(max, j - i);
                break;
            }
        }
        return max;
    }
}
