package com.exaltpawarikanda.solutions.datastructures.leetcode.alg.arrays;


/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1
 * Explanation:
 * Only 1771 contains an even number of digits.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 500
 * 1 <= nums[i] <= 105
 */
public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums1 = {12,345,2,6,7896};
        int[] nums2 = {555,901,482,1771};
        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int num: nums){
            int count = 0;
            do{
                num = num/10;
                count++;
            }while(num > 0);

            if(count % 2 == 0){
                result++;
            }
        }
        return result;
    }


        //SOLUTION 2
     /*   int result = 0;
        for(int num: nums){
            if(String.valueOf(num).length() % 2 == 0){
                result++;
            }
        }
        return result;
    }*/

        //SOLUTION 3 : Paying attention to constraints
   /*     int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000) || nums[i] == 100000) {
                count++;
            }
        }

        return count;
    }*/
}
