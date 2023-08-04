package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class LC1380{
    public static void main(String[] args) {
        //{1,10,4,2},{9,3,8,7},{15,16,17,12}
        int[][]matrix = { {3,7,8},
                          {9,11,13},
                          {15,16,17} };
        System.out.println(sol(matrix));
    }

    public static List sol(int[][]matrix) {
        List<Integer> luckyNumbers  = new ArrayList<>();
        for(int i =0;i<matrix.length;i++){
            int minIndex = 0;
            int min = 9999999;
        for(int j =0;j<matrix[i].length;j++){
           if(matrix[i][j]<min){
min = matrix[i][j];
minIndex = j;
           }; 
        }
        boolean isTrue = true;
        for(int j =0;j<matrix[i].length;j++){
           if(matrix[i][minIndex]<matrix[j][minIndex]){
               isTrue = false;
               break;
           }; 
        }
        if(isTrue){
luckyNumbers.add(matrix[i][minIndex]);
        }
        }
        return luckyNumbers; 
        }

    }
