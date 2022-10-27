package Topics;
import java.util.Arrays;
import java.util.Scanner;

public class largestCommonprefix {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] s = { "flower", "flight", "flow" };
    // System.out.println(LCP(s));
    System.out.println(longestCommonPrefix(s));
    
  }
   public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}

//   public static String LCP(String[] s) {
// if (s==null || s.length==0) {
//   return " ";

// }
  // }

