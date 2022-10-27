package HR.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String s = in.next();
  int k = in.nextInt();
String ans = getSmallestandLargest(s, k);
System.out.println(ans);
}  

public static String getSmallestandLargest(String s, int k) {
  String current_string = s.substring(0, k);
  String smallest = current_string;
  String largest= current_string;
  for (int i = 1; i <=s.length()-k; i++) {
    current_string = s.substring(i, i + k);
    if (current_string.compareTo(largest)>0) {
      largest = current_string; 
    } 
    if (current_string.compareTo(smallest)<0) {
      smallest = current_string; 
    }
  }
  return smallest +"\n"+ largest;

}
}
