package Topics.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LSRec {
  public static void main(String[] args) {

    int[] arr = { 1, 2, 3,4, 4, 5 };
    int target = 4;
    // int ans2 = findIndexLast(arr, target, arr.length - 1);
    // int ans = findIndex(arr, target, 0);
    // System.out.println(ans2);
    // System.out.println(ans);
    // System.out.println(find(arr, target, 0));
    findAllIndex(arr, target, 0);
    System.out.println(list);
  }

  static ArrayList<Integer> list = new ArrayList<>();

  public static void findAllIndex(int[] arr, int target, int index) {

    if (index==arr.length) {
      return; 
    }
if (arr[index]==target) {
  list.add(index);
}
    
    findAllIndex(arr, target, index+1);
  }

public static boolean find(int[] arr, int target, int index) {
  if (index == arr.length) {
    return false;
  }
  return (arr[index] == target) || find(arr, target, index + 1);
}

public static int findIndexLast(int[] arr, int target, int index) {
  if (index==-1) {
    return -1; 
  }
  if (arr[index]==target) {
    return index; 
  }
  else{
    return findIndexLast(arr, target, index - 1);  
  }
}

public static int findIndex(int[] arr, int target, int index) {
if (index==arr.length) {
 return -1; 
}
if (arr[index]==target) {
  return index; 
}
else {
  return findIndex(arr, target, index + 1);
}
}
}
