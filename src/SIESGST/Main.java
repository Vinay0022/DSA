// package codechef;

import java.util.ArrayList;
import java.util.Scanner;

class Main {
  Scanner input = new Scanner(System.in);
  int ans ;
  int product;
  int t;
  ArrayList<Integer> m = new ArrayList<>();

  void incomp() {
    t = input.nextInt();
    for (int i = 0; i < t; i++) {
      int A = input.nextInt();
      int B = input.nextInt();
      int C = input.nextInt();

      product = A * B;
      if (C != 0) {
        ans = product % C;
      }
      m.add(ans);
      ans = 0;
    }
    for (int i = 0; i < t; i++) {
      System.out.println(m.get(i));
    }

  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.incomp();

  }

}
