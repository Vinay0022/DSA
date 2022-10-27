package Leetcode;

import java.util.Arrays;

import Topics.missingNumber;

// https://leetcode.com/problems/missing-number/
public class LC268 {
public static void main(String[] args) {
  int[] nums = { 0, 4, 2, 1 };
  int ans = missingNumber(nums);
  System.out.println(ans);
}  
 public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;
        while(start<end){
            int mid = start+(end-start)/2;
            if(nums[mid]>mid) end =mid;
            else start=mid+1;
        }
        return start;
    }
}
