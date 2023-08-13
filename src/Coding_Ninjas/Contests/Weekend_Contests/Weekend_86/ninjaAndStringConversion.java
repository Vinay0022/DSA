package Coding_Ninjas.Contests.Weekend_Contests.Weekend_86;



public class ninjaAndStringConversion{
  public static void main(String[] args) {
    int N = 4;
    //WjDdLfwXqNyzKetdikZRKankpmnAsLBZOkIKfGAHActCvz
    String str = "WjDdLfwXqNyzKetdikZRKankpmnAsLBZOkIKfGAHActCvz";
    System.out.println(sol(N, str));
  }

  public static String sol(int N ,String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <str.length() ; i++) {
        if (str.charAt(i)=='A') {
         char lower = 'Z'; 
          sb.append(lower);
        }
    if (str.charAt(i)>'A'&& str.charAt(i)<='Z') {
        char lower = str.charAt(i);
        sb.append(--lower);
    }

        if (str.charAt(i)=='z') {
         char higher= 'a'; 
          sb.append(higher);
        }

    if (str.charAt(i)>='a'&& str.charAt(i)<'z') {
        char higher = str.charAt(i);
        sb.append(++higher);
    }
    }
    return sb.toString();
   }
}
