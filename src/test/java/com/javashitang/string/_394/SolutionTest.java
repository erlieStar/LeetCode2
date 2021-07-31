package com.javashitang.string._394;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-31
 */
public class SolutionTest {

    @Test
    public void decodeString() {
        Solution solution = new Solution();
        String result = solution.decodeString("3[a]2[bc]");
        System.out.println(result);
    }
}