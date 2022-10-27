package Leetcode;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class LC121 {
  public static void main(String[] args) {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    // int[] prices = {7,6,4,3,1};
    int ans = maxProfit(prices);
    System.out.println(ans);
  }

  private static int maxProfit(int[] prices) {
    int lsf = Integer.MAX_VALUE;
    int op = 0;
    int pist = 0;
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < lsf) {
        lsf = prices[i];
      }
      pist = prices[i] - lsf;
      if (op < pist) {
        op = pist;
      }
    }
    return op;
  }

}
