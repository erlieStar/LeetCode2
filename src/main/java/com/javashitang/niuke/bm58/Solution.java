package com.javashitang.niuke.bm58;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public ArrayList<String> Permutation(String str) {
        char[] array = str.toCharArray();
        Set<String> result = new HashSet<>();
        backTracking(array, 0, result);
        return new ArrayList<>(result);
    }

    public void backTracking(char[] array, int cur, Set<String> result) {
        if (cur == array.length) {
            result.add(String.valueOf(array));
            return;
        }
        for (int i = cur; i < array.length; i++) {
            swap(array, cur, i);
            backTracking(array, cur + 1, result);
            swap(array, cur, i);
        }
    }

    public void swap(char[] array, int left, int right) {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}