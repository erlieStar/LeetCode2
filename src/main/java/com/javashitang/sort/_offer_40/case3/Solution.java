package com.javashitang.sort._offer_40.case3;


/**
 * @author lilimin
 * @since 2021-08-25
 */
class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0 || k == 0) {
            return new int[0];
        }
        int[] countArray = new int[10001];
        for (int num : arr) {
            countArray[num]++;
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = 0; i < countArray.length && index < k; i++) {
            while (countArray[i] > 0 && index < k) {
                countArray[i]--;
                result[index++] = i;
            }
        }
        return result;
    }
}
