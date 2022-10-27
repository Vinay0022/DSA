package Topics;

public class ReverseRec {
  // Way 1 for solving the question
  //   public static void main(String[] args) {
  //     int n = 123456;
  //     Reverse(n);
  //     System.out.println(sum);
  //   }

  //   static int sum = 0;

  // public static void Reverse(int n) {
  //   if (n==0) {
  //     return; 
  //   }
  //   int rem = n % 10;
  //   sum = sum * 10 + rem;
  //   Reverse(n/10);

  // }

  public static void main(String[] args) {
    int n = 1234;
   System.out.println(Rev2(n));
  }

  public static int Rev2(int n) {
    int digits =  (int)Math.log10(n)+1;
    return helper(n, digits); }

  private static int helper(int n, int digits) {
    if (n%10==n) {
      return n; 
    }
    int rem = n%10;
    return rem*(int)(Math.pow(10, digits-1))+helper(n/10, digits-1);
  }
}
