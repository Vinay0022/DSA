package Topics;

public class palindromRec {
public static void main(String[] args) {
  int n = 12321;
  System.out.println(pali(n));
}  
public static int Rev(int n){
  int digits=(int)(Math.log10(n))+1;
   return helper(n, digits);

}

private static int helper(int n, int digits) {

  if (n % 10 == n) {
    return n;
  }
  int rem = n % 10;
  return rem * (int) (Math.pow(10, digits - 1)) + helper(n/10, digits - 1);
}


public static boolean pali(int n){
  return n == Rev(n);
}
}
