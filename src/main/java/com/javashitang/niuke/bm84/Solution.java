package com.javashitang.niuke.bm84;

public class Solution {

    public String longestCommonPrefix (String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String target = strs[0];
        for (int i = 0; i < target.length(); i++) {
            char titem = target.charAt(i);
            int j;
            for (j = 1; j < strs.length; j++) {
                if (i > strs[j].length() - 1) {
                    break;
                }
                char item = strs[j].charAt(i);
                if (titem != item) {
                    break;
                }
            }
            if (j != strs.length) {
                return target.substring(0, i);
            }
        }
        return target;
    }
}
