
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class Reverse_Array{
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        int start = 0;
        int end = nums.length-1;
        reverse2(start,end,nums);
        System.out.println(Arrays.toString(nums));
    }

    public static  void reverse(int start,int end,int[] nums) {
        int temp ;
        if(start>=end)
        return ;
       temp = nums[start]; 
       nums[start]= nums[end]; 
       nums[end]= temp; 
       reverse(start+1, end-1, nums);
    }
    public static void reverse2(int start,int end,int[]nums){
        while(start<end){
int temp;
temp = nums[start];
nums[start] = nums[end];
nums[end] = temp;
start++;
end--;
        }
    }


}
