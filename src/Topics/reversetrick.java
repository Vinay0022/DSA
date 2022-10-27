package Topics;

public class reversetrick {
  public static void main(String[] args) {
    int n = 826107293;
System.out.println(reverse(n));
  }

  public static int reverse(int n) {
   
    int ans = 0;
    int mod = 1000000007;
    while (n != 0) {
        if ( (ans<Integer.MIN_VALUE%mod) || ans >Integer.MAX_VALUE%mod) {
      return -1; 
    }
      int r = n % 10;
      ans = ans * 10 + r;
      n = n / 10;
    }
   
    return ans;
  }
  
}
