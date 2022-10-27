package Topics;

public class isOddBit {
public static void main(String[] args) {
  int n = 23;
  System.out.println(check(n));
}

private static boolean check(int n) {
  return (n & 1)==1;
}  
}
