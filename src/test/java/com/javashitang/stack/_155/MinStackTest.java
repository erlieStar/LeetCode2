package com.javashitang.stack._155;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.*;

/**
 * @author lilimin
 * @since 2021-07-08
 */
public class MinStackTest {

    @Test
    public void test() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(4);
        queue.add(5);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

}