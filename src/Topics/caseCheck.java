package Topics;

import java.util.Scanner;

public class caseCheck {
public static void main(String[] args) {
  System.out.print("Enter the character:");
  Scanner in = new Scanner(System.in);
  char c = in.next().trim().charAt(0); 
  if (c>='A'&& c<='Z') {
   System.out.print("Uppercase"); 
  } else {
System.out.print("Lowercase");
  }
}  
}
