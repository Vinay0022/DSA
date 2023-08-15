package Leetcode;

public class LC125{
  public static void main(String[] args) {
    // race a car
    // A man, a plan, a canal: Panama
    String s = "race a car";
    System.out.println(sol2(s));
  }

  public static boolean sol2(String s) {
    int i = 0;
    int j = s.length()-1;
    while (i<j) {
     while (i<j && !Character.isLetterOrDigit(s.charAt(i))) {
     i++; 
     } 
     while (i<j && !Character.isLetterOrDigit(s.charAt(j))) {
     j--; 
     } 
      if (i<j&& Character.toLowerCase(s.charAt(i++)) !=Character.toLowerCase(s.charAt(j--))) {
       return false; 
      }
    }
    return true;
  }

}
