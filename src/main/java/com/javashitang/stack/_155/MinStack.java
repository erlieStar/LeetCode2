package com.javashitang.stack._155;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author lilimin
 * @since 2021-07-08
 */
class MinStack {

    private List<Integer> list;
    private Queue<Integer> queue;

    /** initialize your data structure here. */
    public MinStack() {
        list = new ArrayList<>();
        queue = new PriorityQueue<>();
    }

    public void push(int val) {
        queue.add(val);
        list.add(val);
    }

    public void pop() {
        Integer value = list.remove(list.size() - 1);
        queue.remove(value);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return queue.peek();
    }
}
