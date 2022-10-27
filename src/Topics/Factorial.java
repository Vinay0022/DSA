package Topics;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  long n= in.nextLong();  
long ans=  factorial(n);
System.out.println(ans);
}  

public static long factorial(long n) {
if (n==0) {
  return 1; 
}
int fact = 1;
for (int i = 1; i <=n; i++) {
  fact = fact * i;
 }
return fact;
}
}
