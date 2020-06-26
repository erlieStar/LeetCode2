package com.javashitang.easy._349;

import java.util.*;

public class Solution {

    //求2个集合的并集
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i=0; i<nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++) {
            if (set.contains(nums2[i])) {
                result.add(nums2[i]);
            }
        }
        int[] nums3 = new int[result.size()];
        int sum = 0;
        for (Integer a : result) {
            nums3[sum++] = a;
        }
        return nums3;
    }
}
