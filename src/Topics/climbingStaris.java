package Topics;

public class climbingStaris {
public static void main(String[] args) {
  int n = 4;
int ans=  climbingstaris(n);
System.out.println(ans);
}  
public static int climbingstaris(int n){
if (n==0||n==1) {
  return n; 
}
  int stepOne = 1;
  int stepTwo = 1;
  int result = 0;
  for (int i = 2; i <= n; i++) {
    result = stepOne + stepTwo;
    stepTwo = stepOne;
    stepOne = result;
  }
  return result;
}
}
