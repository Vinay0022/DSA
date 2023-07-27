package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class LC1346{
    public static void main(String[] args) {
        //7,1,14,11
        //-2,0,10,-19,4,6,-8
         int[] arr = {0,0};
        // System.out.println(sol(arr));
        System.out.println(sol3(arr));
    }



public static boolean sol(int[]arr){
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
        int num=arr[i]*2;
        for (int j = 0; j < arr.length; j++ ) {
        if(arr[j]==num && i!=j){return true;}
        }
        
    }
    return false;
}
    }
