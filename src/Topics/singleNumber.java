package Topics;

public class singleNumber {
public static void main(String[] args) {
  int[] nums = { 2, 2, 1,1,3,3,4 }; 
  int ans = singlenumber(nums);
  System.out.println(ans);
}

public static int singlenumber(int[] nums) {
  int unique = 0;
  for (int i : nums) {
    unique ^= i; 
  }
  return unique;
}  
}
//  if (nums.length==1) {
//   return nums[0]; 
// }
// int ans =0;
// int d = 0;
// for (int i = 0; i <= nums.length; i++) {
//  if (nums[i]==nums[i+1]) {
//  d = nums[i]; 
//  } 
// if (nums[i]!=nums[i+1]) {
//  ans=nums[i]; 
// } 
// }
// return ans;
