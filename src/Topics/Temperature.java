package Topics;
import java.util.Scanner;

public class Temperature {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  float fahrenheit = in.nextFloat();
  float celsius = (fahrenheit - 32) * 5 / 9;
  System.out.println(fahrenheit +"F" +" = " + celsius+"C");
  // int n = 123456789;
//   int m = 0;
//   while (n != 0) {
//     m = (10 * m) + (n % 10);
//     n = n / 10;
//   }
//   System.out.println(m);
//   System.out.println(n);
// }  
}
