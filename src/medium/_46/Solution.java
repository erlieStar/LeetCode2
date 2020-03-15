package medium._46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        nextArray(0, nums, finalList);
        return finalList;
    }

    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void nextArray(int cur, int[] nums, List<List<Integer>> finalList) {
        if (cur == nums.length) {
            List<Integer> tempList = Arrays.stream(nums).boxed().collect(Collectors.toList());
            finalList.add(tempList);
            return;
        }
        for (int i = cur; i < nums.length; i++) {
            swap(nums, cur, i);
            nextArray(cur + 1, nums, finalList);
            swap(nums, cur, i);
        }
    }
}
