package com.mycompany.app;

import java.util.Arrays;

public class LC566{
  public static void main(String[] args) {
    // Input: mat = [[1,2],[3,4]], r = 1, c = 4
    // Output: [[1,2,3,4]]

    // second test case:-
    // Input: mat = [[1,2],[3,4]], r = 2, c = 4
    // Output: [[1,2],[3,4]]
    int[][] mat = {
      {1, 2},
      {3, 4}
    };
    int r = 4;
    int c = 1;
    int[][] ans = sol(mat, r, c);
        System.out.println(Arrays.deepToString(ans));
    }

  public static int[][] sol(int[][] mat, int r, int c) {
    int[][] ans = new int[r][c];
    int col = 0;
    int row = 0;
    if (r * c >mat.length*mat[0].length) {
      return mat;
    }
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (col == c) {
          col = 0;
          row++;
        }
        ans[row][col] = mat[i][j];
        col++;
      }
    }
    return ans;
  }
}
