package com.mycompany.app;
import java.util.*;
/**
 * Hello world!
 *
 */
public class LC58{
    public static void main(String[] args) {
String s = " fly me   to   the moon " ;
System.out.println(sol(s));
    }

    public static int sol(String s) {
String[] ans = s.split(" ");
String word = ans[ans.length-1];
int len = word.length();
return len;
}
}
