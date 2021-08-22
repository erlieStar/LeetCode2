package com.javashitang.hashTable.interview.error;

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

        for (int i = 0; i < str.length() ; i++) {
            Character content = str.charAt(i);
            Integer count = map.getOrDefault(content, 0);
            map.put(content, count + 1);
            if (count + 1 >= maxCount) {
                maxCount = count + 1;
                result = content;
            }
        }
        return result;
    }
}