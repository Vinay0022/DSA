package Topics;
//https://leetcode.com/problems/move-zeroes/
public class MoveZeros {
public static void main(String[] args) {
  int[] arr = {0,1,0,3,12};
 int arr_size = arr.length;
 move(arr, arr_size);
 for (int i = 0; i < arr.length; i++) {
 System.out.print(" "+arr[i]); 
 }
}  
public static void move(int[]arr,int arr_size){
  int count=0;
  for (int i = 0; i < arr.length; i++) {
      //traverse through the array if a non-zero element is found put that in count++
   if (arr[i]!=0) {
    arr[count++] = arr[i];
   } 
  }
  //we placed all the non-zero elements in the array now place all the zero elements at last index
  while (count<arr_size) {
    arr[count++] = 0; 
  }
}
}

