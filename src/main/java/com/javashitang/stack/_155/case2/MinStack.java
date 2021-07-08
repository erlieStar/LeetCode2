package com.javashitang.stack._155.case2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-07-08
 */
class MinStack {

    private List<Integer> list;
    private List<Integer> minList;

    /** initialize your data structure here. */
    public MinStack() {
        list = new LinkedList<>();
        minList = new LinkedList<>();
        minList.add(Integer.MAX_VALUE);
    }

    public void push(int val) {
        list.add(val);
        minList.add(Math.min(minList.get(minList.size() - 1), val));
    }

    public void pop() {
        list.remove(list.size() - 1);
        minList.remove(minList.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minList.get(minList.size() - 1);
    }
}
