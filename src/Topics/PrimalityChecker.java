package Topics;
import java.util.Scanner;

public class PrimalityChecker {

 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();
   System.out.println(prime(n));  
 } 

public static boolean prime(int n) {
if (n<=1) {
  return false; 
}
int c = 2;
while (c*c<=n) {
 if (n%c==0) {
   return false; 
 } 
   c += 1;
}
return true;
 }



// gives prime for 9 which is wrong
// if (n == 1) {
//   return false;

// }
// if (n%2==0) {
//  return false; 
// }
// return true;
// }
}