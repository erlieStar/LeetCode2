package com.javashitang.backtracking._22;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-05
 */
public class SolutionTest {

    @Test
    public void generateParenthesis() {
        Solution solution = new Solution();
        List<String> strings = solution.generateParenthesis(3);
        System.out.println(strings.size());
        System.out.println(strings);
    }

    @Test
    public void valid() {
        Solution solution = new Solution();
        char[] items = {'(','(',')',')','(',')'};
        System.out.println(solution.valid(items));
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        char[] items = {'(', ')'};
        System.out.println(solution.valid(items));
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        char[] items = {'(', '('};
        System.out.println(solution.valid(items));
    }
}