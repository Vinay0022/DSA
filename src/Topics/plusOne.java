package Topics;

import java.util.Arrays;

public class plusOne {
public static void main(String[] args) {
  int[] digits = { 9}; 
  System.out.println(Arrays.toString(plusone(digits)));
}  

public static int[] plusone(int[] digits) {
  for (int i = digits.length - 1;i>=0; i--) {
   if (digits[i]!=9) {
     digits[i]++; 
     break;
   } 
   else {
     digits[i] = 0;
   }
  }
  if (digits[0]==0) {
    int[] newArray = new int[digits.length+1];
    newArray[0]=1;
    System.arraycopy(digits, 0, newArray, 1, digits.length);
    digits = newArray;
  }
  return digits;
}
}
