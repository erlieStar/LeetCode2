package com.javashitang.niuke.bm100;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Solution(int capacity) {
        // write code here
    }

    public int get(int key) {
        // write code here
        return 0;
    }

    public void set(int key, int value) {
        // write code here
    }

    public class ListNode {
        int key;
        int value;

        public ListNode() {};

        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public class LruCache {

        DoubleList doubleList = null;
        Map<Integer, ListNode> map = null;

        public LruCache() {
            doubleList = new DoubleList();
            map = new HashMap<>();
        }
    }

    public class DoubleList {

        ListNode head = null;
        ListNode tail = null;

        public DoubleList() {
            head = new ListNode();
            tail = new ListNode();
        }

        public void makeRecent() {

        }

        public void remove() {

        }

        public void addToTail() {

        }
    }
}