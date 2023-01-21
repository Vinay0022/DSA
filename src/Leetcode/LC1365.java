import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * nothing
 */
public class LC1365 {

  public static void main(String[] args) {
    int[] nums= {8,1,2,2,3};
    System.out.println(Arrays.toString(sol(nums)));
  }

  public static int[] sol(int []nums) {
int [] ans = new int[nums.length];
for (int i = 0; i < ans.length; i++) {
  int count = 0;
  for (int j = 0; j < ans.length; j++) {
if (nums[i]>nums[j]) {
 count+=1; 
}
  }
  ans[i] = count;
  
}
return ans;
  }
}