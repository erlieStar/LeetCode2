package com.javashitang.linkedList._2;


import java.util.ArrayList;
import java.util.List;

/**
 * @author lilimin
 * @since 2021-06-25
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        List<Integer> resultList = getSum(list1, list2);
        return buildList(resultList);
    }

    private ListNode buildList(List<Integer> resultList) {
        ListNode temp = new ListNode();
        ListNode result = temp;
        for (Integer item : resultList) {
            ListNode listNode = new ListNode(item);
            temp.next = listNode;
            temp = temp.next;
        }
        return result.next;
    }

    public List<Integer> getSum(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        int num = 0;
        int index = 0;
        while (index < list1.size() && index < list2.size()) {
            int sum = list1.get(index) + list2.get(index) + num;
            resultList.add(sum % 10);
            num = sum / 10;
            index += 1;
        }
        if (index == list1.size() && index == list2.size()) {
            if (num != 0) {
                resultList.add(num);
            }
        } else if (index == list1.size()) {
            addOneList(index, num, list2, resultList);
        } else if (index == list2.size()) {
            addOneList(index, num, list1, resultList);
        }
        return resultList;
    }

    public void addOneList(int index, int num, List<Integer> list, List<Integer> resultList) {
        while (index < list.size()) {
            int sum = list.get(index) + num;
            resultList.add(sum % 10);
            num = sum / 10;
            index += 1;
        }
        if (num != 0) {
            resultList.add(num);
        }
    }
}
