package Topics;

public class lengthOfLastWord {
public static void main(String[] args) {
  String s = "Hello World";
  int ans = lengthoflastword(s);
  System.out.println(ans);
}  

public static int lengthoflastword(String s) {
  String[] str = s.split(" ");
  if (str.length==0) {
    return 0; 
  }
  return str[str.length - 1].length();
}
}
