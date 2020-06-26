package com.javashitang.medium._46;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1, 2, 3, 4};
        List<List<Integer>> finalList = solution.permute(array);
        System.out.println(finalList.size());
        System.out.println(finalList);
    }
}
