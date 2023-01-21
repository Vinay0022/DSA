import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * nothing
 */
public class LC1678 {

  public static void main(String[] args) {
    String command = "G()()()()(al)";
System.out.println(sol(command));
  }

  public static String sol(String command) {
    String ans = "";
for (int i = 0; i < command.length();i++) {
 if (command.charAt(i)=='G') {
 ans+='G'; 
 } 
if (command.charAt(i)=='('&& command.charAt(i+1)==')') {
 ans+='o'; 
} 
if (command.charAt(i)=='a') {
 ans+="al"; 
}
}
return ans;
  }
}