/**
 * nothing
 */
public class nothing {

  public static void main(String[] args) {
    int n = 5;
    sol(n);
  }
  public static void sol(int n) {
if (n==1) {
 System.out.println(n); 
 return;
}
System.out.println(n);
    sol(n-1);
    System.out.println(n);
    }
}