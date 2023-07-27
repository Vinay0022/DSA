package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class LC657 {
    public static void main(String[] args) {
        // RLUURDDDLU
        String moves = "UD";
        System.out.println(sol(moves));
    }

    // brute force
    public static boolean sol(String moves) {
        int R = 0;
        int L = 0;
        int U = 0;
        int D = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                R++;
            }
            if (moves.charAt(i) == 'L') {
                L++;
            }
            if (moves.charAt(i) == 'D') {
                D++;
            }
            if (moves.charAt(i) == 'U') {
                U++;
            }
        }
        if (R == L && U == D) {
            return true;
        }
        return false;
    }

}
