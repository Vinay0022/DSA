package Leetcode;

public class LC217 {
public static void main(String[] args) {
  int arr[] = { 1, 2, 3, 4 };
  System.out.println(ans(arr));

}  

public static boolean ans(int []arr){
	
  
for (int i = 0; i < arr.length; i++) {
  for (int j = i+1; j < arr.length; j++) {
   if (arr[i]==arr[j]) {
   return true; 
   } 
  }
}
return false;
}
}
