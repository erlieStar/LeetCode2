package com.javashitang.sort._347;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-25
 */
public class SolutionTest {

    @Test
    public void topKFrequent() {
        int[] num = {1,1,1,2,2,3};
        Solution solution = new Solution();
        int[] nums = solution.topKFrequent(num, 2);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}