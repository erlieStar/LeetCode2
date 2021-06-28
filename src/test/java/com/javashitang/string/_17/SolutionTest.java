package com.javashitang.string._17;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-06-28
 */
public class SolutionTest {

    @Test
    public void letterCombinations() {
        Solution solution = new Solution();
        List<String> list = solution.letterCombinations("23");
        System.out.println(list);
    }
}