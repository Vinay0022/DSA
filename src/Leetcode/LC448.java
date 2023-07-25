package com.mycompany.app;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class LC448{
    public static void main(String[] args) {
        //3,11,8,16,4,15,4,17,14,14,6,6,2,8,3,12,15,20,20,5
        int[] nums = {3,11,8,16,4,15,4,17,14,14,6,6,2,8,3,12,15,20,20,5};
        System.out.println(sol(nums));
    }

    public static ArrayList<Integer> sol(int[] nums) {
        //In leetcode they have used List 
        ArrayList<Integer>list = new ArrayList<Integer>();
int [] arr = new int [nums.length];
for (int i: nums) {
    arr[i-1]++;
}
for (int i = 0; i < arr.length; i++) {
if(arr[i]==0){
list.add(i+1);
}
}
return list;
    }


}
