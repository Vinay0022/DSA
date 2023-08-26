

public class totalChocolates{
  public static void main(String[] args) {
    int [] a = {25,24,10,15};
    System.out.println(sol(a));

  }
  public static long sol(int[]a){
    //time limit exceeded with the following commented code
//     int count=0;
// for (int i = 0; i < a.length; i++) {
//  if (a[i]>23) {
//  while (a[i]>23) {
// a[i]--;  
//           count++;
//  } 
//  } 
// }
// return count;
     long count =0;

        for (int i = 0; i < a.length; i++) {

            if (a[i]>23) {

              count+= a[i]-23;

            }

        }

  return count;
  }
}
