import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * nothing
 */
public class LC1431 {

  public static void main(String[] args) {
int[] candies = {2,3,5,1,3};
int extraCandies = 3;
System.out.println(sol(candies, extraCandies));
  }

  public static  List<Boolean> sol(int []candies,int extraCandies) {
    List<Boolean> winners = new ArrayList<Boolean>();
    int max = 0;
    for (int i = 0; i < candies.length; i++) {
      max = Math.max(max, candies[i]);
    }
    for (int i = 0; i < candies.length; i++) {
      if (candies[i]+extraCandies>=max) {
        winners.add(true);
      }
      else{
        winners.add(false);
      }
    }
    return winners;
  }
}