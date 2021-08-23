package com.javashitang.bfs._752;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-23
 */
public class SolutionTest {

    @Test
    public void openLock() {
        Solution solution = new Solution();
        String[] deadends = {"0201","0101","0102","1212","2002"};
        int i = solution.openLock(deadends, "0202");
        System.out.println(i);
    }
}