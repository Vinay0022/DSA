package Topics.recursion;

public class BSRec {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4 };
    int tar = 2;
  System.out.println(BS(arr, tar, 0, arr.length - 1));
  }


  public static int BS(int[] arr, int tar,int s ,int e) {
    if (s>e) {
      return -1; 
    }

    int mid = s + (e - s) / 2;
    if (arr[mid]==tar) {
      return mid; 
    }
    if (arr[mid]>tar) {
   return  BS(arr, tar, s, mid-1); 
    }
    return BS(arr, tar, mid + 1, e);
    
  }
}
