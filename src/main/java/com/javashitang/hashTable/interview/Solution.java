package com.javashitang.hashTable.interview;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-08-22
 */
public class Solution {

    public char getMaxOccurChar(String str) {

        int maxCount = 1;
        Character result = new Character(str.charAt(0));

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character content = str.charAt(i);
            map.put(content, map.getOrDefault(content, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
