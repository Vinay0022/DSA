import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    int t = sc.nextInt();
    for (int i = 0; i < t; i++) {
     int a = sc.nextInt();
     int m = a-1;  int k = -1;
     for (int j = 1; j < (a/2); j++,m--) {
     if (j%2==0 && m%2==0) {
     k = 1;
     System.out.println("Yes"); 
     break;
     }
    }
     if (k==-1) {
System.out.println("NO");
     }
     } 
    }
  }
