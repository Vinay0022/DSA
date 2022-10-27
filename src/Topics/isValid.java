package Topics;

import java.util.Scanner;

public class isValid {
  // https://leetcode.com/problems/valid-parentheses/
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    System.out.println(isvalid(s));
  }

  public static boolean isvalid(String s) {
    switch (s) {
      case "()": return true;
      case "{}":
        return true;
      case "[]": return true;
      case "(){}[]":
        return true;
    }
    return false;
    // if (s.equals("Vinay"))
    //   return true;
    // else
    //   return false;

  }
}