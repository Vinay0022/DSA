package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class LC1051{
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
       System.out.println(sol(heights)); 

    }

    public static int sol(int[] heights) {
        int count = 0;
        int [] second = Arrays.copyOf(heights, heights.length);
        Arrays.sort(second);
for (int i = 0; i <second.length; i++) {
   if(heights[i]!=second[i]) {
count++;
   }
}
return count;
    }


}
