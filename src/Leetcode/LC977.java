package Leetcode;

import java.util.Arrays;

public class LC977 {
 public static void main(String[] args) {
   int[] nums = { -4, -1, 0, 3, 10 };
   sortedSquares(nums);
   System.out.println(Arrays.toString(nums));
 }

private static int[]sortedSquares(int[] nums) {
  for (int i = 0; i < nums.length; i++) {
    nums[i] = nums[i] * nums[i];
  }
  Arrays.sort(nums);
  return nums;



} 


