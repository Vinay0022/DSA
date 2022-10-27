package Topics;

import java.util.Scanner;

public class AreaOfCircle{
  public static void main(String[] args) {
    // Area of a circle
    System.out.print("Enter the radius of circle:");
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    double pi = 3.141592653589793238;
   double ans = pi*r*r;
System.out.println(ans);
  }
}