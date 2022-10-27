package Topics;

import java.util.Arrays;
import java.util.Collection;

public class SortZeroAndOnes {
public static void main(String[] args) {
  int[] arr = { 0, 1, 0, 1 ,0,0,1,1,0};
  int arr_size = arr.length;
  
 sort(arr,arr_size);
 print(arr,arr_size); 
}  

  public static void sort(int[] arr, int arr_size) {
    int s = 0;
    int e = arr_size - 1;
    while (s < e) {
      while (arr[s] == 0 && s < e) {
        s++;
      }
      while (arr[e] == 1 && s < e) {
        e--;
      }
      if (s < e) {
        arr[s] = 0;
        arr[e] = 1;
        s++;
        e--;
      }
      
    }
}
public static void print(int[] arr, int arr_size) {
  for (int i = 0; i < arr.length; i++) {
   System.out.print(" "+arr[i]); 
  }
}

}
