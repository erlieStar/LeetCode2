package com.javashitang.newcoder.nc63;

import junit.framework.TestCase;
import org.junit.Test;

public class SolutionTest extends TestCase {

    @Test
    public void testIsContinuous() {
        Solution solution = new Solution();
        int [] numbers = {1, 3, 0 , 7 ,0};
        System.out.println(solution.IsContinuous(numbers));

    }
}