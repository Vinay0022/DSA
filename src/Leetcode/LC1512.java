package Leetcode;

public class LC1512 {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 3 };
    System.out.println(answer(arr));
  }

  public static int answer(int[] arr) {
    int ans = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          ans++;
        }
      }
    }
    return ans;
  }
}