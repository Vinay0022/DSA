public class TowerOfHanoi{
    public static void main(String[] args) {
       moves(3,true) ;
    }
    public static void moves (int n, boolean left){
if(n==0) return;
moves(n-1,!left);

if(left) {System.out.println(n + "left"); }
else{System.out.println(n + "right");}
moves(n-1,!left);
    }
}
