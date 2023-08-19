public class stringCount{
  public static void main(String[] args) {
    // ***
    // ##**
    // #*#*
    String s = "##**";
    int n = s.length();
    System.out.println(sol(n, s));

  }


    public static int sol(int n, String s) {
      int count = 0;
     char [] c= s.toCharArray();
      for (int i = 0; i <c.length-1; i++) {
        for (int j = i+1; j < c.length; j++) {
         if (c[i]=='#'&&c[j]=='*') {
         count++;
            j=c.length;
         }
          else if (c[i]=='*'&&c[j]=='#') {
         count++;
            j=c.length;
         }else{
  j= c.length;

          }
        }
      }
      return count;
    }
}
