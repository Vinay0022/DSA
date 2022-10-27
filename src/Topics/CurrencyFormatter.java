package Topics;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

public class CurrencyFormatter{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
     String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    //   String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);
      NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

      String india= formatter.format(payment);
    String china =  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
     String france = NumberFormat.getCurrencyInstance(Locale.FRENCH).format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        
  }
}