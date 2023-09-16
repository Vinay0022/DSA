

public class workaholicEmployee{
    public static void main(String[] args) {
        //100100000000000000000000000001
        //111000000000000000000000000000
// 101010111000000000000000000011
// 111110000000000000000000000000
// 111000000001001111110111100001
      String s = "111000000001001111110111100001";
      System.out.println(sol(s));

    }
    public static int sol(String s){
        int count =0;
for (int i = 0; i <s.length(); i++) {
    if (s.charAt(i)=='1') {
count++;
i++;
    }

}
return count;

} }
