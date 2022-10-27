package Topics;

import java.util.Arrays;

public class selectionSort {
public static void main(String[] args) {
  int[] arr = { 4, 3, 1, 2, 5 };
  SeS(arr);
  System.out.println(Arrays.toString(arr));
}


  public static void SeS(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int lastI = arr.length - i - 1;
      int maxIndex = getMaxIndex(arr, 0, lastI);
      swap(arr, maxIndex, lastI);
    }
  }

  private static void swap(int[] arr, int maxIndex, int lastI) {
    int temp = arr[maxIndex];
    arr[maxIndex] = arr[lastI];
    arr[lastI] = temp;
  }

  private static int getMaxIndex(int[] arr, int start, int end) {
    int max = start;
    for (int i = start; i <= end; i++) {
      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }
}