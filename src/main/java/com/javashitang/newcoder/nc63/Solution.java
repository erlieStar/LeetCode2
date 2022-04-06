package com.javashitang.newcoder.nc63;

import java.util.Arrays;

public class Solution {

    public boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int numOfZero = 0;
        int pre = -1;
        for (int i = 0; i < numbers.length;) {
            if (numbers[i] == 0) {
                numOfZero++;
                i++;
            } else {
                if (pre == -1 || pre + 1 == numbers[i]) {
                    pre = numbers[i];
                    i++;
                } else if (pre == numbers[i]) {
                    return false;
                } else {
                    if (numOfZero > 0) {
                        pre += 1;
                        numOfZero--;
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
