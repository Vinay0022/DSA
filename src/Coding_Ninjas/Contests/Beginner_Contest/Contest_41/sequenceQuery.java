
public class sequenceQuery{
  public static void main(String[] args) {
    // 1000000000 -1000000000 0
    // 5 0 3
    // -1000000000 1 1000000000
    int a = 1;
    int d = 4;
    int x = 7;
    System.out.println(sol(a, d, x));
  }

  public static int sol(int a, int d, int x) {
    if (a < 0) {
      a = -a;
    } else if (d < 0) {
      d = -d;
    }

    if (a > x && d < x) {
      System.out.println("break first");
      return 0;
    }

    if (a + d + x == a) {
      System.out.println("break second");
      return 1;
    }
    int value = ((a + x) / 2);

    if (value % 2 == 0 && d % 2 == 0) {
      System.out.println("break third");
      return 1;
    }

    if (value % 2 != 0 && d % 2 != 0) {
      System.out.println("break forth");
      return 1;
    }

    if (value == x) {
      return 1;
    }

    System.out.println("break last");
    return 0;
  }
}
