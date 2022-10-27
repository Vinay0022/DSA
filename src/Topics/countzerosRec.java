package Topics;

public class countzerosRec {
public static void main(String[] args) {
  int n = 300000;
  int ans = countzeros(n);
  System.out.println(ans);
  // int ans = Countzeros(n);
  // System.out.println(ans);
}
// Solving in recursive way
private static int countzeros(int n) {
  return helper(n,0);
}

private static int helper(int n, int c) {
  if (n==0) {
   return c ; 
  }
int rem = n % 10;
if (rem==0) {
  return helper(n/10, c + 1);
}
return helper(n / 10, c);
}  

// Solving without recursion
// public static int Countzeros(int n) {
//   int count = 0;
//   while (n!=0) {
//     int rem = n % 10;
//     if (rem==0) {
//       count++; 
//     } 
//     n /= 10;
//   }

//  return count;
// }

//Solving with recursion

}
