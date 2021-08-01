package com.javashitang.stack._394;

import org.junit.Test;

import java.util.Stack;

/**
 * @author lilimin
 * @since 2021-07-31
 */
public class SolutionTest {

    @Test
    public void decodeString() {
        Solution solution = new Solution();
        String result = solution.decodeString("3[a2[c]]");
        System.out.println(result);
    }

    @Test
    public void test1() {
        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        stack.add(result.toString());
        String str = "aaa" + stack.pop() + "aaa";
        System.out.println(str);
    }
}