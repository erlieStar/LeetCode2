package medium._300.step2;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {10,9,2,5,3,7,101,18};
        int count = solution.lengthOfLIS(nums);
        System.out.println(count);
        int[] nums1 = {1,3,6,7,9,4,10,5,6};
        count = solution.lengthOfLIS(nums1);
        System.out.println(count);
    }
}
