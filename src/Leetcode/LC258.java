package com.mycompany.app;

public class LC258{
  public static void main(String[] args) {
    int num= 18;
    System.out.println(sol(num));
  }

  public static int sol(int num) {
if (num==0) {
 return 0; 
}
    if (num%9==0) {
     return 9; 
    }
    return num%9;
  }
}
