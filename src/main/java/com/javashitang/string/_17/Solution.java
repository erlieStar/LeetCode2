package com.javashitang.string._17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lilimin
 * @since 2021-06-28
 */
class Solution {

    Map<Character, List<String>> numMap = new HashMap<>();

    {
        numMap.put('2', new ArrayList<>(Arrays.asList("a", "b", "c")));
        numMap.put('3', new ArrayList<>(Arrays.asList("d", "e", "f")));
        numMap.put('4', new ArrayList<>(Arrays.asList("g", "h", "i")));

        numMap.put('5', new ArrayList<>(Arrays.asList("j", "k", "l")));
        numMap.put('6', new ArrayList<>(Arrays.asList("m", "n", "o")));
        numMap.put('7', new ArrayList<>(Arrays.asList("p", "q", "r", "s")));

        numMap.put('8', new ArrayList<>(Arrays.asList("t", "u", "v")));
        numMap.put('9', new ArrayList<>(Arrays.asList("w", "x", "y", "z")));
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        getResult(result, digits, "");
        return result;
    }

    public void getResult(List<String> result, String digits, String current) {
        if (digits.length() == current.length()) {
            result.add(current);
            return;
        }
        List<String> tempList = numMap.get(digits.charAt(current.length()));
        for (String s : tempList) {
            getResult(result, digits, current + s);
        }
    }
}
