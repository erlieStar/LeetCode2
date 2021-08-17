package com.javashitang.dfs._79;

import org.junit.Test;

/**
 * @author lilimin
 * @since 2021-08-06
 */
public class SolutionTest {

    @Test
    public void exist() {
        char[][] temp = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Solution solution = new Solution();
        boolean result = solution.exist(temp, "ABCCED");
        System.out.println(result);
    }
}