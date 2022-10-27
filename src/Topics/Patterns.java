package Topics;

/**
 * Practise
 */
public class Patterns {

  public static void main(String[] args) {
    // pattern2(4);
    // pattern1(4);
    // pattern3(5);
    // pattern4(5);
    // pattern5(5);
    // pattern28(5);
    // pattern30(5);
    // pattern17(4);
    // pattern31(4);
    // pattern6(5);
    // pattern7(5);
    //  pattern10(5);
    //  pattern11(5);
    
  }

  static void pattern2(int n) {
    for (int i = 1; i <= n; i++) {
      //for every row, run the col
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      //when one row is printed, we need to add a newline
      System.out.println();
    }
  }

  static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
    
  static void pattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    } 
  }
  
  static void pattern5(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int totalColInRow = i > n ? 2 * n - i : i;
      for (int j = 0; j < totalColInRow; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern6(int n){
    for (int i = 1; i <= n; i++) {
      for (int spaces = 0; spaces < n-i; spaces++) {
       System.out.print("  "); 
      }
 for (int j = 1; j <=i; j++) {
 System.out.print("* "); 
 } 
 System.out.println();
}
  }

  static void pattern7(int n) {
    for (int i = 1; i <= n; i++) {
      int noofcolumns = n - i + 1;
      for (int spaces = 0; spaces < n - noofcolumns; spaces++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= noofcolumns; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  static void pattern10(int n) {
    for (int i = 1; i <=n; i++) {
      for (int j = 0; j <n-i; j++) {
       System.out.print(" "); 
      }
     for (int j = 1; j <=i; j++) {
     System.out.print("* "); 
     } 
     System.out.println();
    }
  }

static void pattern11(int n){
  for (int i = 1; i <=n; i++) {
    for (int spaces = 0; spaces <n-(n-i+1) ; spaces++) {
     System.out.print(" "); 
    }
   for (int j = 1; j <=n-i+1; j++) {
   System.out.print("* "); 
   } 
   System.out.println();
  }
}

  static void pattern28(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int totalColInRow = i > n ? 2 * n - i : i;
      int noofspaces = n - totalColInRow;
      for (int s = 0; s < noofspaces; s++) {
        System.out.print(" ");
      }
      for (int j = 0; j < totalColInRow; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  
  static void pattern30(int n) {
    for (int i = 1; i <= n; i++) {
      for (int spaces = 0; spaces < n - i; spaces++) {
        System.out.print("  ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      for (int k = 2; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();
    }
  }

  static void pattern17(int n) {
    for (int i = 1; i <= 2 * n-1; i++) {
      int c = i > n ? 2 * n - i : i;
      for (int spaces = 0;spaces <n-c; spaces++) {
       System.out.print("  "); 
      }
     for (int j = c; j >=1 ; j--) {
     System.out.print(j+" "); 
     } 
     for (int k = 2; k <= c; k++) {
       System.out.print(k + " ");
     }
     System.out.println();
    }
  }

  static void pattern31(int n) {
    int original = n;
    n = 2 * n;

    for (int i = 0; i <=n; i++) {
      for (int j = 0; j <=n; j++) {
        int atEveryIndex = original -Math.min(Math.min(i, j), Math.min(n - i, n - j));
        System.out.print(atEveryIndex+" ");
      }
      System.out.println();
    }
  }
  }