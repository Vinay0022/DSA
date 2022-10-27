package Leetcode;

public class LC771 {
 public static void main(String[] args) {
   String jewels = "aA";
   String stones = "aAAbbbb";
   int ans = numJewelsInStone(jewels, stones);
   System.out.println(ans); 

 } 

public static int numJewelsInStone(String jewels,String stones){
  int count = 0;
  for (int i = 0; i < stones.length(); i++) {
    if (jewels.indexOf(stones.charAt(i)) > -1) {
      count++;
    }
  }
  return count;
 }
}
