package com.javashitang.easy._455;

import java.util.Arrays;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) {
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int gIndex = 0;
        int sIndex = 0;
        while (gIndex < g.length && sIndex < s.length) {
            if (g[gIndex] <= s[sIndex]) {
                // g[gIndex]这个小孩获得饼干
                gIndex++;
            }
            sIndex++;
        }
        return gIndex;
    }
}
