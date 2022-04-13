package com.javashitang.Interview._08_09;

import junit.framework.TestCase;

import java.util.List;

public class SolutionTest extends TestCase {

    public void testGenerateParenthesis() {
        Solution solution = new Solution();
        List<String> strings = solution.generateParenthesis(3);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}