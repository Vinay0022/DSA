package com.mycompany.app;


public class ninjaAndRangeMax{
    public static void main(String[] args) {
        int x = 4;
        int y = 4;
        int[] a= {2,4,6,8,9,10};
        System.out.println(sol(x, y, a));
    }

    public static int sol(int x ,int y,int [] a){
       int i = x;
       int biggest = Integer.MIN_VALUE;
while (i<=y) {

if (biggest<a[i]) {
biggest = a[i];
i++;
}else{
i++;
}
}
return biggest;

    }

}
// golang,mongodb,react(can be replace by svelte)
