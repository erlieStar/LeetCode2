package com.javashitang.tree._236;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-08-07
 */
public class SolutionTest {

    @Test
    public void lowestCommonAncestor() {
        List<Integer> array1 = new ArrayList<>();
        test(array1);
        System.out.println(array1);
    }

    public void test(List<Integer> array1) {
        List<Integer> array2 = Arrays.asList(1, 2, 3);
        array1.addAll(array2);
    }
}