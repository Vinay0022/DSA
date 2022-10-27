package Topics;

public class SumofDigitsRec {
public static void main(String[] args) {
  int n = 2341;
  int ans = solution(n);
  int ans2 = solution2(n);
  System.out.println(ans);
  System.out.println(ans2);
}

private static int solution(int n) {
  if (n == 0) {
    return 0;
  }
  return (n % 10) + solution(n / 10);
}

private static int solution2(int n) {
  if (n%10==n) {
    return n; 
  }
  return (n % 10) * solution2(n / 10);
}
}
