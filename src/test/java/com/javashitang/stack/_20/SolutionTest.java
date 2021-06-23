package com.javashitang.stack._20;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-23
 */
public class SolutionTest {

    @Test
    public void isValid() {
        Solution solution = new Solution();
        String str = "]";
        System.out.println(solution.isValid(str));
    }
}