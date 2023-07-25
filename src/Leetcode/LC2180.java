package com.mycompany.app;


/**
 * Hello world!
 *
 */
public class LC2180{
    public static void main(String[] args) {
        int num =910;
        System.out.println(sol(num));
    }

    public static int sol(int num) {
        int ans=0;
        for (int i = 1; i <= num; i++) {
           int sum =0; 
           int num2 = i;
           while (num2>0) {
               sum+=num2%10;
               num2=num2/10;
           } 
           if(sum%2==0){
ans++;
           }
        }
        return ans;
            
        }
}
    
