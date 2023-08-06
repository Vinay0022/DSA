
import java.util.*;

/** Hello world! */
public class Box_Filling{
  public static void main(String[] args) {
    int n = 2;
        int x = 4;
        int y = 3;
    System.out.println(sol(n,x,y));
  }

  public static int sol(int n,int x,int y) {
        boolean isTrue= true;
        int count =1;
        while (isTrue) {
         if (count*y>=n*x) {
         isTrue= false;
         }
          count++;
        }
    return count-1;
  }
}
