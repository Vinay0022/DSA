public class gcdrec{
  public static void main(String[] args) {
    int p = 102;
    int q = 68;
    int ans = gcd(p, q);
    System.out.println(ans);
  }
public static int gcd(int p,int q){
if(q==0) return p;
return gcd(q,p%q);
}

  public static int gcd2(int p, int q) {
    while(q != 0) {
      int temp = q;
      q = p % q;
      p = temp;
    }
    return p;
  }
}
