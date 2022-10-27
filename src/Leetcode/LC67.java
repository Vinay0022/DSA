package Leetcode;

public class LC67 {
 public static void main(String[] args) {
   String a = "11";
   String b = "1";
   String ans = addBinary(a, b);
   System.out.println(ans);
 } 
    public static String addBinary(String a, String b) {
      StringBuilder sb = new StringBuilder();
      int i = a.length() - 1;
      int j = b.length() - 1;
      int carry = 0;
      while (i>=0 || j>=0) {
        int sum = carry;
        if (j >= 0)
          sum += a.charAt(j--) - '0'; 
        if (i >= 0)
          sum += a.charAt(i--) - '0'; 
        sb.append(sum % 2);
        carry = sum / 2;
      }
        if (carry!=0) sb.append(carry);
     return sb.reverse().toString();
          
         
      }
      }

