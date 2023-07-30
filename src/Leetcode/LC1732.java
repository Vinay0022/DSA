package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class LC1732{
    public static void main(String[] args) {
        //-4,-3,-2,-1,4,3,2
        int []gain = {-4,-3,-2,-1,4,3,2};
    System.out.println(sol(gain));    
    }

    public static int sol(int [] gain) {
        int max = 0;
        int newMax = 0;
        for (int i = 0; i < gain.length; i++) {
            newMax = newMax+gain[i];
            if(max<newMax){
max = newMax;
            }

        }
        return max;

}

}
