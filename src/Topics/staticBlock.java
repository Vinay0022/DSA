package Topics;

import java.util.Scanner;

public class staticBlock {
  static int B;
  static int H;
  static boolean flag;

  static {
    Scanner in = new Scanner(System.in);
    B = in.nextInt();
    H = in.nextInt();
    flag = true;

    try {
      if (B<=0 || H<=0) {
        flag = false; 
        throw new Exception("Breadth and Height must be positive");
      }
    } catch (Exception e) {
      System.out.println(e);
      //TODO: handle exception
    }
  }{
 if (flag) {
   int area = B * H;
   System.out.println(area);
 } 
}  
// public static void main(String[] args) {
//   Scanner in = new Scanner(System.in);
//   int n = in.nextInt();
//   String s = String.valueOf(n);
//   System.out.println(s);
// }
}
