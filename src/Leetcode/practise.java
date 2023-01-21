package Leetcode;

import java.util.Scanner;

/**
 * practise
 */
public class practise {

    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int t = in.nextInt();
int ans=0;
while (t-->0) {
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
if (a+b+c>=2) {
   ans++; 
}
}
System.out.println(ans);
    }
    }
