package Topics;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class EvenOdd {
 public static void main(String[] args) {
//  Given an integer, n, perform the following conditional actions:
// If n is odd, print Weird
// If n is even and in the inclusive range of 2 to 5, print Not Weird
// If n is even and in the inclusive range of 6 to 20, print Weird
// If n is even and greater than 20, print Not Weird
/// my first soultions
// Scanner in = new Scanner(System.in);
// int n = in.nextInt();
// if (n%2!=0) {
//  System.out.println("Weird"); 
// }
// if (n=2) {
//  System.out.println("Not Weird"); 
// }
// if (n = 6) {
//   System.out.println("Weird");
// }
// if (n=21) {
//  System.out.println("Not Weird"); 



Scanner in = new Scanner(System.in);
System.out.print("Enter the number:");
int n = in.nextInt();
if (n%2!=0) {
 System.out.println("Weird"); 
}
else {
  if (n >= 2 && n <= 5) {
    System.out.println("Not Weird");
  }
  else if (n>=6 && n<=20) {
   System.out.println("Weird"); 
  }
  else {
    System.out.println("Not Weird");
  }
}
  } 
}
