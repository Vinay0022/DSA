package HR.strings;

import java.util.Scanner;

public class JavaisAnagram {
public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String a = in.next();
  String b = in.next();
  boolean ret =  isAnagram(a, b);
  System.out.println((ret) ? "Anagrams": "Not Anagrams");
}  

static boolean isAnagram(String a, String b) {
  int char_frequencies[] = new int[26];
  a = a.toLowerCase();
  b = b.toLowerCase();
   
  for (int i = 0; i < a.length(); i++) {
    int current_char = a.charAt(i);
    int index = current_char - 'a';
    char_frequencies[index]++;
  }

  for (int i = 0; i <b.length(); i++) {
    int current_char = b.charAt(i);
    int index = current_char - 'a'; 
    char_frequencies[index]--;
  }

  for (int i = 0; i <26; i++) {
   if (char_frequencies[i]!=0) return false; 
  }
   return true;
}
}
