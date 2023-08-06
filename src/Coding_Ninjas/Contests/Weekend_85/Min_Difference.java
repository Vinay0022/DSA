
import java.util.*;

/** Hello world! */
public class Min_Difference{
  public static void main(String[] args) {
    int []a = {2, 4 ,3 ,1 ,2 ,1 ,3 };
    System.out.println(sol(a));
  }

public static int sol(int []a) {
        // Write your code here.
  Arrays.sort(a);
    int diff = 99;
    for (int i = 0; i < a.length; i++) {
      for (int j = 1; j < a.length; j++) {
        int diffe = a[j] - a[i];
        if (diff > diffe && diffe>=0 && i!=j) {
          diff = diffe;
        }
      }
    }
    return diff;
 
    }
}
