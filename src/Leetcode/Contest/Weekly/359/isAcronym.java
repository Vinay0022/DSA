
import java.util.ArrayList;
import java.util.List;

public class isAcronym{
  public static void main(String[] args) {
//     ["afqcpzsx","icenu"]
// "yi"
    List<String>words = new ArrayList<String>();
    words.add("afqcpzsx");
    words.add("icenu");
    String s = "yi";
System.out.println(sol(words, s));
  }


  public static boolean sol(List<String>words,String s ) {
    if (words.size()!=s.length()) {
     return false; 
    }
    boolean isTrue = false;
for (int i = 0; i < words.size(); i++) {
      if (words.get(i).charAt(0)==s.charAt(i)) {
        System.out.println(words.get(i).charAt(0));
 isTrue = true; 
      }
 else{
 isTrue = false; 
        break;
      } 
}
    return isTrue;
  }
}
