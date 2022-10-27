package Leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class LC628 {
  public static void main(String[] args) {
    int[] nums = { 1,2,3,4 };
    int ans = maximumProduct(nums);
    System.out.println(ans);

 }

 public static int maximumProduct(int[] nums) {
  int n = nums.length;
  Arrays.sort(nums);
  return (Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n - 1]));
 }

}

