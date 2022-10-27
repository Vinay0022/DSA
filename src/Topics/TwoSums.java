package Topics;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSums {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] nums= new int[5];
    for (int i = 0; i <nums.length; i++) {
      nums[i] = in.nextInt();
    }
  int target = 9;
 int[] ans= twoSum(nums, target);
 System.out.println(Arrays.toString(ans));
  }

  public static  int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (i == j) {
          continue;
        } else {
          if (nums[i] + nums[j] == target) {
            result[0] = j;
            result[1] = i;
          }
        }
      }
    }
    return result;
  }
}