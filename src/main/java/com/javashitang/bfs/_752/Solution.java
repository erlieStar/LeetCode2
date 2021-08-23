package com.javashitang.bfs._752;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author lilimin
 * @since 2021-08-23
 */
class Solution {

    public int openLock(String[] deadends, String target) {
        Set<String> visit = new HashSet<>();
        for (String deadend : deadends) {
            if (deadend.equals("0000")) {
                return -1;
            }
            visit.add(deadend);
        }
        Queue<String> queue = new LinkedList<>();
        queue.add("0000");
        visit.add("0000");
        int total = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String item = queue.poll();
                if (item.equals(target)) {
                    return total;
                }
                for (int j = 0; j < 4; j++) {
                    char[] chars = item.toCharArray();
                    char temp = chars[j];
                    chars[j] = nextNum(temp);
                    String str = new String(chars);
                    if (!visit.contains(str)) {
                        queue.add(str);
                        visit.add(str);
                    }
                    chars[j] = preNum(temp);
                    str = new String(chars);
                    if (!visit.contains(str)) {
                        queue.add(str);
                        visit.add(str);
                    }
                }
            }
            total++;
        }
        return -1;
    }

    public char nextNum(char num) {
        return num == '9' ? '0' : (char) (num + 1);
    }

    public char preNum(char num) {
        return num == '0' ? '9' : (char) (num - 1);
    }
}
