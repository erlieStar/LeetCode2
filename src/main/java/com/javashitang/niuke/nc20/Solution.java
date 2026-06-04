package com.javashitang.niuke.nc20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Solution {

    ArrayList<String> result = new ArrayList<>();

    public ArrayList<String> restoreIpAddresses (String s) {
        List<String> item = new ArrayList<>();
        backtracking(s, item, 0, 0);
        return result;
    }

    public void backtracking(String s, List<String> item, int index, int cur) {
        if (cur == 4) {
            String temp = item.stream().collect(Collectors.joining("."));
            if (s.length() == temp.length() - 3) {
                result.add(temp);
            }
            return;
        }
        for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
            String substring = s.substring(index, index + i);
            if (check(substring)) {
                item.add(substring);
                backtracking(s, item, index + i, cur + 1);
                item.remove(item.size() - 1);
            }
        }
    }

    public boolean check(String str) {
        if (str.startsWith("0") && str.length() != 1) {
            return false;
        }
        Integer num = Integer.valueOf(str);
        if (num > 255) {
            return false;
        }
        return true;
    }
}
