package com.mycompany.app;


public class nothing {
    public static void main(String[] args) {
int [] balls = {3,4,5,2,1,4,2};
System.out.println(sol(balls));
    }
    public static int sol(int [] balls){
        int count = -1;
for (int i = 0; i < balls.length-1; i++) {
    for (int j = 0; j < balls.length; j++) {
if (balls[i]==balls[j]&& i!=j) {
    if (count<balls[i]) {
count=balls[i];
    }
}
    }

}
return count;
}

 }
// golang,mongodb,react(can be replace by svelte)
