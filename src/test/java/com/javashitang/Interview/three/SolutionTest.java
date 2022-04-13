package com.javashitang.Interview.three;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testGetAnswer() {
        Solution solution = new Solution();
        int[] array = new int[]{2,3,1,10,4,30};
        int[] answer = solution.getAnswer(array, 2, 31);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i] + " ");
        }
        System.out.println();
    }
}