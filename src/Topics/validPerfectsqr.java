package Topics;

public class validPerfectsqr {
  public static void main(String[] args) {
    int num = 4;
    System.out.println(validperfectsqr(num));

  }

  public static boolean validperfectsqr(int num) {
    int r = num;
    while (r * r >= num) {
      r = (r + num / r) / 2;
    }
      return r * r == num;
  }
}
// for (int check = 0; check <=num/2 ; check++) {
// if (num==1) {
// return true;
// }
// if (check*check ==num) {
// return true;
// }
// }
// return false;

// for (int check = 0; check <=num/2 ; check++) {
// if (num==1) {
// return true;
// }
// if (check*check ==num) {
// return true;
// }
// }
// return false;