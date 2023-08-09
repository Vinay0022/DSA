package Leetcode;

import java.util.Arrays;

public class LC540{
  public static void main(String[] args) {
    //2,1,2,2,0,0,2,0
    //3,3,7,7,10,11,11
    int []nums = {3,3,7,7,10,11,11};
    System.out.println(sol(nums));
}
  public static int sol(int[]nums){
int [] arr = new int[nums.length*2];
for (int i = 0; i < nums.length; i++) {
      if (nums[i]!=0) {
 int correctI = nums[i] -1; 
      arr[correctI]++  ;
      }
}
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length; i++) {
     if (arr[i]==1) {
     return  i+1;
     } 
    }
    return 0;
  }

}
