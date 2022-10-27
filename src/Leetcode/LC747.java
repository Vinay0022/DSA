package Leetcode;

/**
 * LC747
 */
public class LC747 {

 public static void main(String[] args) {
 int [] nums ={3,6,1,0}; 
int ans= dominantlargest(nums);
System.out.println(ans);
 }

private static int dominantlargest(int[] nums) {
  int max = Integer.MIN_VALUE;
  for (int i : nums) {
    max = Math.max(i, max);
  }

  int pos = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == max)
      pos = i;
    int twice = nums[i] * 2;
    if (twice > max && nums[i] != max)
      return -1;    

  }
  return pos;
}}