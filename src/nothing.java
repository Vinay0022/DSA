import java.util.Arrays;

/**
 * nothing
 */
public class nothing {

  public static void main(String[] args) {
    int[] nums = {1,2,3,4};
    System.out.println(Arrays.toString(sol(nums)));
  }

  public static int [] sol(int[] nums) {
int [] ans = new int[nums.length];
for (int i = 0; i < ans.length; i++) {
  ans[0] = nums[0];
  for (int j = 0; j < ans.length; j++) {
   if (j-1>=0) {
   ans[i] = nums[i] +nums[j-1]; 
   } 
   }
  }
  return ans;
//   int j =i;
//   if (j<ans.length && j-1>=0){
//     ans[i] = nums[j] +nums[j-1];
//   }else{
//     ans[i] = nums[j];
//   }
// }
// return ans;
  }
}