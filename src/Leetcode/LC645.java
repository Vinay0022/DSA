package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class LC645{
    public static void main(String[] args) {
        int[] nums = {2,2};
        System.out.println(Arrays.toString(sol(nums)));
    }

    //Time Complexity ==> 0(N)
    //Space Complexity ==> 0(N)
    public static int[] sol(int[] nums) {
        // arr = {0,0}
        int[] arr = new int[nums.length];
        // result = {0,0}
        int[] result = new int[2];
          //correct index of the element(i) which is nums element ==> nums-1;
          //e.g. elmenent 2 should lie in 1 index i.e. correct index of the element = element -1;
        for (int i : nums) {
          //the elements in the arr will start incrementing by 1 for the particular (correct)index in arr for the nums element and if duplicate occured then that  particular element of the index will get incremented twice.
            // e.g. i==>2(nums[0]) ==> arr[2-1]++; ==> arr[1]++ ==> 0++==> 1
            // arr = {0,1}
            // e.g. i==>2(nums[1]) ==> arr[2-1]++; ==> arr[1]++ ==> 1++==> 1
            // arr = {0,2}
         arr[i-1]++; 
        }
        for (int i = 0; i < arr.length; i++) {
            //It means you have found the duplicate number.
           if(arr[i]==2){
               //why i +1 its reverse of the above i.e. correct element = correct index of the element +1;
            result[0] =i+1;
           }
// It means you have found the missing number.
           if(arr[i]==0){
               result[1] = i+1;
           } 
        }
        //reult [duplicate number, missing number]
        return result;
    }

}
