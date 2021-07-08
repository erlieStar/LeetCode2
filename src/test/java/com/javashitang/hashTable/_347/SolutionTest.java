package com.javashitang.hashTable._347;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-07-05
 */
public class SolutionTest {

    @Test
    public void topKFrequent() {
        int[] nums = {1,1,1,2,2,3};
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(nums, 2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void topKFrequent1() {
        int[] nums = {-1, -1};
        Solution solution = new Solution();
        int[] result = solution.topKFrequent(nums, 1);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    @Test
    public void test1() {
        Queue<Integer> queue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        queue.add(1);
        queue.add(2);
        queue.add(3);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    @Test
    public void test2() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(3, 1);
        map.put(2, 5);
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, ((o1, o2) -> o1.getValue().compareTo(o2.getValue())));
        System.out.println(map);
    }
}