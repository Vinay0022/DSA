package Topics;

import java.util.Arrays;

public class SortedMatrix {
public static void main(String[] args) {
 int[][] arr= { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
     { 33, 34, 38, 50 } };
 int tar = 30;
     System.out.println(Arrays.toString(ans(arr, tar)));
    }  

    public static int[]ans(int[][]arr,int tar) {
      int r = 0;
      int c = arr[0].length - 1;
      while (r<arr.length&& c>=0) {
       if (arr[r][c]==tar) {
         return new int[]{ r, c }; 
       } 
       if (arr[r][c]<tar) {
         r++; 
       }
       else {
         c--;
       }
      }
      return new int[] { -1, -1 };
}
}
