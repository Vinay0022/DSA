package Topics;

public class maximumProduct {
public static void main(String[] args) {
  int[] nums = { 1, 2, 3 }; 
 int ans= maximumproduct(nums);
 System.out.println(ans);
}  
public static int maximumproduct(int []nums)
{
int max =0;
for (int i = 0; i < nums.length; i++) {
  int maxx = nums[i]*nums[nums.length-1];
  max = maxx*nums[nums.length-1-1];
}
return max;
}
}
