package Topics;

public class mySqrt {
public static void main(String[] args) {
  int x = 8;
 int sol= ans(x);
 System.out.println(sol);
}  

public static int ans(int x) {
  int start = 0;
  int end = x;
  while (start<=end) {
    long mid = (start + (end - start) / 2);
    if (mid*mid==x) {
      return (int)mid; 
    } 
    if (mid*mid > x) {
      end =(int) mid - 1;
    }
    if (mid*mid<x) {
      start = (int)mid + 1; 
    }
  }
  return end;
}

}
