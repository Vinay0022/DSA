package Leetcode;
//2 ways to solve this problem :- 1)Floyd's cycle detection algorithm (Tortoise and hare) 2) Using set Hashset 
public class LC202 {
  public static void main(String[] args) {
    int n = 2;
    System.out.println(isHaapy(n));
  }

  public static boolean isHaapy(int n) {
    if (n <= 0)
      return false;
    
    while (n>=10) {
      int sum = 0;
      while (n!=0) {
        sum += (n % 10) * (n * 10);
        n /= 10; 
      } 
      n = sum;
    }
    return n == 1 || n == 7;
    
  
}

}
