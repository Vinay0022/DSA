package Topics;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
  // Reverse the given number
  System.out.print("Enter the number:");
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int ans = 0;
  while (n>0) {
    int rem = n % 10;
    n /= 10;
    ans = ans * 10 + rem; 
  }
  System.out.print(ans);
}  

}
