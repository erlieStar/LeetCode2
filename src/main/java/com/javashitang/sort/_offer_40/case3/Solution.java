package com.javashitang.sort._offer_40.case3;


/**
 * @author lilimin
 * @since 2021-08-25
 */
class Solution {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] countArray = new int[10001];
        for (int num : arr) {
            countArray[num]++;
        }
        int[] result = new int[k];
        int index = 0;
        for (int i = 0; i < countArray.length && index < k; i++) {
            while (countArray[i] > 0) {
                countArray[i]--;
                result[index++] = i;
            }
        }
        return result;
    }
}
