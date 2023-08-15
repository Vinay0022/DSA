package Topics;
public class Zig_Zag{
  public static void main(String[] args) {
    int[][] arr = {{1,2},{3,4}};
    sol2(arr);
  }

  public static void sol2(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        if (i % 2 == 0) {
          System.out.println(arr[i][j]);
        } else {
          for (int k = arr[i].length - 1; k >= 0; k--) {
            System.out.println(arr[i][k]);
          }
          j=arr[i].length;
        }
      }
    }
  }
}
