package com.mycompany.app;

import java.util.*;

/** Hello world! */
public class LC1460{
  public static void main(String[] args) {
    //3,7,9
    //3,7,11
    int[] target = {392,360};
    int[] arr = {392,360};
    System.out.println(sol(target, arr));
  }

  public static boolean sol(int[] target, int[] arr) {
    boolean isTrue = true;
    Arrays.sort(target);
    Arrays.sort(arr);
    for (int i = 0; i < target.length; i++) {
      if (arr[i] != target[i]) {
        isTrue = false;
      }
    }
    return isTrue;
  }
}
