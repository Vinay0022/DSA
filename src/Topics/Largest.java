package Topics;

import java.util.Scanner;

public class Largest {
  public static void main(String[] args) {
    // find the largest number
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 numbers:");

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

    // int max = a;
    // if (a > b) {
    //   max = b;
    // }
    // if (c>b) {
    //   max = c;
    // }

    // int max = 0;
    // if (a>b) {
    //   max = a; 
    // } else {
    //   max = b;
    // }
    // if (c>b) {
    //   max = c; 
    // } 
  
     int max = Math.max(c, Math.max(a, b));
    System.out.println(max);
  }
}
