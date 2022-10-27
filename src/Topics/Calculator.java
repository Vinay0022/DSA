package Topics;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  //Take the input from the user until the user hits the x or X
  int ans = 0;
  while (true) {
    //Enter the operator 
    System.out.print("Entert the operator:");
    char op = in.next().trim().charAt(0);
    if (op=='+'||op=='-'||op=='/'||op=='*') {
      System.out.print("Enter two numbers:");
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      if (op == '+') {
        ans = num1 + num2;
      }
      if (op == '-') {
        ans = num1 - num2;
      }
      if (op == '*') {
        ans = num1 + num2;
      }
      if (op == '/') {
        if (num2 != 0) {
          ans = num1 / num2;
        }
      }}
      else if (op=='x'|| op=='X') {
        break;
      } else {
       System.out.println("Enter a valid operator"); 
      }
  System.out.println(ans);
    }
  }
}  

