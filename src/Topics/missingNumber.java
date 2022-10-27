package Topics;

import java.util.Arrays;

public class missingNumber {
public static void main(String[] args) {
  int[] nums = { 0,1};
int ans =  missingnumber(nums);
System.out.println(ans);
}  

public static int missingnumber(int[]nums) {
  Arrays.sort(nums);
int start = 0;
int end = nums.length;
while (start<end) {
  int mid = start + (end - start) / 2;
    if (nums[mid] > mid)
    end = mid;
  else
    start = mid + 1;
  
}
return start;
}
}
