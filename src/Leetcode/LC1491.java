package com.mycompany.app;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class LC1491{
    public static void main(String[] args) {
int []salary = {4000,3000,1000,2000};
System.out.println(sol(salary));
    }

    public static double sol(int[] salary) {
        double average = 0;
        double num = salary.length-2;
        Arrays.sort(salary);
        // 1000,2000,3000,4000
for (int i = 1; i < salary.length-1; i++) {
   average += salary[i] ;
}
   average /=num;
return average;

    }


}
