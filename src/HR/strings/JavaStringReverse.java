package HR.strings;

import java.util.Scanner;

public class JavaStringReverse {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String sc = in.next();
    String ans = isPalindrome(sc);
    System.out.println(ans);

  }

  public static String isPalindrome(String sc) {
    int start = 0;
    int end = sc.length() - 1;
    while (start <= end) {
      if (sc.charAt(start) != sc.charAt(end)) {
        return "No";
      }
      start++;
      end--;
    }

    return "Yes";
  }
}
