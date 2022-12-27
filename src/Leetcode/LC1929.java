import java.util.Arrays;

/**
 * nothing
 */
public class LC1929 {

  public static void main(String[] args) {
    int[] nums = {1,2,1};
    System.out.println(Arrays.toString(sol(nums)));
  }

  public static int [] sol(int[] nums) {
    int[] ans = new int[2*nums.length];
    for (int i = 0; i < nums.length; i++) {
     ans[i] = nums[i]; 
    ans[i+nums.length] = nums[i]; 
    }
    return ans;
  }
}