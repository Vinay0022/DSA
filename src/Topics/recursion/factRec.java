package Topics.recursion;

public class factRec{
  public static void main(String[] args) {
    int n = 6;
   int ans =  fact(n);    
   System.out.println(ans);
  }

  private static int fact(int n) {
   if (n<=1) {
     return 1; 
   } 
  return n* fact(n - 1);
  }
}