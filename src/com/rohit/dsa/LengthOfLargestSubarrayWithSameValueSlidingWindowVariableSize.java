package com.rohit.dsa;

public class LengthOfLargestSubarrayWithSameValueSlidingWindowVariableSize {

    public static void main(String[] args) {
        int [] nums = {4,4,4,4,2,2,2,2,2,3,3,3,3,3,3};
        int lenLongestSubArrayWithSameValue = findLengthLongestSubArrayWithSameValue(nums);
        System.out.println("Longest length of a sub array with same value -> " + lenLongestSubArrayWithSameValue);
    }

    // Time Complexity - O(n)
    public static int findLengthLongestSubArrayWithSameValue(int [] nums) {
        int longestLen = 0;

        int leftPointer = 0;

        for(int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if (nums[leftPointer] == nums[rightPointer]) {
                longestLen = Math.max(longestLen, rightPointer - leftPointer + 1);
            }
            else {
                leftPointer++;
            }
        }

        return longestLen;
    }
}
