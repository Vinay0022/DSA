package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class LC1351{
    public static void main(String[] args) {
        int[][] grid = {
                // { 4, 3, 2, -1 },
                // { 3, 2, 1, -1 },
                // { 1, 1, -1, -2 }, 
                // { -1, -1, -2, -3 }
            {3,2},{1,0} 
        };
        System.out.println(sol(grid));
    }

    //brute force
    public static int sol(int[][] grid) {
        int count=0;
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
       if(grid[i][j]<0){
count++;
       } 
    }
}
return count;
    }
}
