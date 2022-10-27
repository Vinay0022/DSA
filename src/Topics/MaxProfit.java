package Topics;


public class MaxProfit {
public static void main(String[] args) {
  int[] arr = { 7,6,4,3,1 };
   System.out.println(maxProfit(arr));
}  
public static int maxProfit(int[]arr){
  int lsf = Integer.MAX_VALUE; // least so far
  int op = 0; // overall profit 
  int pist = 0; // profit if sell today
  for (int i = 0; i < arr.length; i++) {
   if (arr[i]<lsf) { // if we found a price which is smaller than the we found so far we will update the value
     lsf = arr[i]; 
   } 
   pist = arr[i]- lsf; //calculating profit if sold today 
  if (op<pist) {
    op = pist; //update the overall profit  
  } 
  }
  return op;//return op
}
}
