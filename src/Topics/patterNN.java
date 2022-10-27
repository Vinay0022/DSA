package Topics;
import java.util.Scanner;

public class patterNN {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int i = 0;
  while (i<n) {
    for (int j = 0; j < n; j += 1) {
      System.out.print("*");
    }
   System.out.println();
   i++; 
  }
}  
}
