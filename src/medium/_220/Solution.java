package medium._220;

public class Solution {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<=i+k && j<nums.length; j++) {
                long num = Math.abs((long)nums[i] - (long)nums[j]);
                if (num <= t) {
                    return true;
                }
            }
        }
        return false;
    }
}
