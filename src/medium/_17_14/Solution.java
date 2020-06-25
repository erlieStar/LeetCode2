package medium._17_14;

import java.util.PriorityQueue;

public class Solution {

    public int[] smallestK(int[] arr, int k) {
        int[] result = new int[k];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (Integer num : arr) {
            heap.add(num);
        }
        int num = 0;
        while (num < k) {
            result[num] = heap.poll();
            num++;
        }
        return result;
    }

}
