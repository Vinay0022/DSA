import java.util.*;
public class joeAndCheeseCake{

    public static void main(String[]args){
        int n = 13;
        int m =5;
        System.out.println(sol(n, m));
    }

public static int sol(int n,int m){
int days = 0;
if (m>n) {
return 1;
}
while (n>0) {
n -=m;
days++;
}
return days;
}
}


