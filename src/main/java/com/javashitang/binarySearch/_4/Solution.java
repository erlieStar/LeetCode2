package com.javashitang.binarySearch._4;

/**
 * @author lilimin
 * @since 2021-08-07
 */
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int target = total / 2;
        int nums1Index = 0;
        int nums2Index = 0;
        int leftTarget = 0;
        int rightTarget = 0;
        for (int i = 0; i <= target; i++) {
            leftTarget = rightTarget;
            if (nums1Index == nums1.length) {
                rightTarget = nums2[nums2Index];
                nums2Index++;
            } else if (nums2Index == nums2.length) {
                rightTarget = nums1[nums1Index];
                nums1Index++;
            } else if (nums1[nums1Index] <= nums2[nums2Index]) {
                rightTarget = nums1[nums1Index];
                nums1Index++;
            } else {
                rightTarget = nums2[nums2Index];
                nums2Index++;
            }
        }
        if ((total & 1) == 1) {
            return rightTarget;
        } else {
            return (leftTarget + rightTarget) * 1.0 / 2;
        }
    }
}
