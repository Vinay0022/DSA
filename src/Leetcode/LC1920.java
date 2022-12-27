import java.util.Arrays;

/**
 * nothing
 */
public class LC1920 {

  public static void main(String[] args) {
    int[] nums = {0,2,1,5,3,4};
    System.out.println(Arrays.toString(sol(nums)));
  }

  public static int [] sol(int[] nums) {
int [] ans = new int[nums.length];
for (int i = 0; i < ans.length; i++) {
 ans[i] = nums[nums[i]]; 
}
return ans;
  }
}