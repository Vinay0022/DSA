package Leetcode;
// https://leetcode.com/problems/power-of-four/
public class LC342 {
public static void main(String[] args) {
  int n = 64;
System.out.println(isPowerOfFour(n));
}

private static boolean isPowerOfFour(int n) {
  if(n==0)return false;
    while(n!=1){
     if(n%4!=0)return false;
     n/=4;
     } 
     return true;
//  return n>0 && (n&(n-1))==0 && (n-1)%3==0;
}
}
