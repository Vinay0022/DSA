package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15{
  public static void main(String[] args) {
    int[] nums = {-1, 0, 1, 2, -1, -4};
    System.out.println(sol(nums));
  }

  public static List<List<Integer>> sol(int[] nums) {

    // 0  1  2 3 4 5
    // After sorting ==> [-4,-1,-1,0,1,2]
    // the lenghth of the nums ==> 6 so it will only run upto 3 index so we can capture the 2 pair
    // sums
    Arrays.sort(nums);
    List<List<Integer>> output_arr = new ArrayList<>();
    
    for (int i = 0; i < nums.length - 2; i++) {
      System.out.println(i);
      //num[i]!=num[i-1] will not consider the duplicate number
      if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
        int low = i + 1;
        int high = nums.length - 1;
        int sum = 0 - nums[i];
        while (low < high) {
          if (nums[low] + nums[high] == sum) {
            output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
            System.out.println("low ==" + nums[low]+"index"+ low);
            System.out.println("high==" + nums[high]+"index"+ high);
            System.out.println(output_arr);
            //nums[low] ==nums[low+1] && nums[high] ==nums[high-1] will check if there exists same low and high in the next increment e.g. case [-2,0,0,2,2] here you can see the low =0 and high = 2 will get repeated if we don't include this 2 while loops
             while (low < high && nums[low] == nums[low + 1]) low++;
            while (low < high && nums[high] == nums[high - 1]) high--;
            low++;
            high--;
          } else if (nums[low] + nums[high] > sum) {
            high--;
          } else {
            low++;
          }
        }
      }
    }
    return output_arr;
  }
}
