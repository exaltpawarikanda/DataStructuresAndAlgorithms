package com.exaltpawarikanda.solutions.datastructures.leetcode.alg.arrays;


/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * Example 1:
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * <p>
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int[] nums3 = {1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums1));
        System.out.println(findMaxConsecutiveOnes(nums2));
        System.out.println(findMaxConsecutiveOnes(nums3));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (result < count) {
                    result = count;
                }
                count = 0;
            }
        }

        if (result < count) {
            result = count;
        }
        return result;

       /* int count = 0;
        int result = 0;

        if(nums.length == 0){
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }
        return result; */
    }
}