package com.javashitang.hashTable._347;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lilimin
 * @since 2021-07-05
 */
class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        // 整数 - 频次
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : nums) {
            Integer value = map.getOrDefault(num, 0);
            value += 1;
            map.put(num, value);
        }
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
        System.out.println(entries);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}
