package Topics;

import java.util.Scanner;

public class data {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int t = in.nextInt();
  for (int i = 0; i < t; i++) {
   try {
     long x = in.nextLong();
     System.out.println(x +"Can be fitted in:");
     if (x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)System.out.println("* byte"); 
     if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)System.out.println("* long"); 
     if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)System.out.println(""); 
     if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short"); 
      
     
   } catch (Exception e) {
    //TODO: handle exception
    System.out.println(in.next()+"Can't be fitted anywhere");
   } 
  }
}  
}
