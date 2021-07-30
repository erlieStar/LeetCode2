package com.javashitang._621;

import org.junit.Test;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-30
 */
public class SolutionTest {

    @Test
    public void leastInterval() {
        Solution solution = new Solution();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C', 'C', 'D', 'D', 'E', 'E'};
        int num = solution.leastInterval(tasks, 2);
        System.out.println(num);
    }

    @Test
    public void test1() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "c");
        map.put(3, "b");
        System.out.println(map.values().stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList()));
    }
}