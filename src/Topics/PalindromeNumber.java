package Topics;
import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  System.out.println(palin(n));
}  
public static boolean palin(int n){
  // it will not work for negative values of we will add a if statement to check if the given number is negative or not. Negative number will never be palindrome.
  if (n<0) {
    return false; 
  }
  int before = n;
  int after =0;
  while (n!=0) {
    int rem = n % 10;
after =  after*10 + rem;
n/=10;
  }
  if (before==after) {
    return true;
  }
  return false;
}
}
