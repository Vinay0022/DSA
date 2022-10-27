package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * x1542A
 */
public class x1542A {

  public static void main(String[] args) {
    BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(infile.readLine());
    int T = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    while (T-->0) {
      st = new StringTokenizer(infile.readLine());
      int N = Integer.parseInt(st.nextToken());
      int[] arr = readArr(N + 2, infile, st);
       
    }
  }
}