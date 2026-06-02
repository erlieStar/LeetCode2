package com.javashitang.niuke.bm92._2;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int maxLength (int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int max = 0;
        Map<Integer, Integer> visit = new HashMap<>();
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (visit.containsKey(arr[i])) {
                // 这里得有一个判断的过程 j = visit.get(arr[i]) + 1;
                j = Math.max(j, visit.get(arr[i]) + 1);
            }
            visit.put(arr[i], i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
