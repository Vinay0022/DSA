package Leetcode;

public class LC941 {
public static void main(String[] args) {
  int[] arr = { 2,0,2};
System.out.println(isvalidMountainArray(arr));
}  

public static boolean isvalidMountainArray(int[] arr) {
  int i = 0;
  while (i < arr.length && i + 1 < arr.length && arr[i] < arr[i + 1]) {
    i++;
  }

  while (i == 0 || i + 1 >= arr.length) {
    return false;
  }

  while (i<arr.length&& i+1<arr.length) {
   if (arr[i]<=arr[i+++1]) {
     return false; 
   } 
  }
  return true;
}
}
