package Topics;

import java.util.Arrays;

public class Twodmatrix {
public static void main(String[] args) {
 int[][] arr = {{1,2,3},{4,5,6},{ 7, 8, 9 }
 }; 
 int tar = 0;
 System.out.println(Arrays.toString(ans(arr, tar)));
}  

public static int[] bs(int[][] arr, int row,int cStart, int cEnd, int tar) {
while (cStart<=cEnd) {
  int mid = cStart + (cEnd - cStart);
  if (arr[row][mid]==tar) {
    return new int[] { row, mid }; 
  } 
  if (arr[row][mid]<tar) {
    cStart = mid + 1;  
  }
  else {
    cEnd = mid-1;
  }
}
  return new int[] { -1, -1 };
}

public static int[] ans(int[][] arr, int tar) {
  int row = arr.length;
  int col = arr[0].length;
  if (col==0) {
   return bs(arr, row, 0, col - 1, tar);  
  }
  int rStart = 0;
  int rEnd = row-1;
  int cMid = col / 2;
  while (rStart < (rEnd - 1)) {
    int mid = rStart + (rEnd - rStart) / 2;
    if (arr[mid][cMid] == tar) {
      return new int[] { mid, cMid };
    }
    if (arr[mid][cMid] < tar) {
      rStart = cMid;
    }
    if (arr[mid][cMid] > tar) {
      rEnd = cMid;
    }
  }

  if (arr[rStart][cMid]==tar) {
   return new int[]{rStart,cMid}; 
  }
  if (arr[rStart + 1][cMid] == tar) {
    return new int[] { rStart + 1, cMid };
  }
  

  if (tar<=arr[rStart][cMid-1]) {
    return bs(arr, rStart, 0, cMid - 1, tar);
  }
  if (tar>=arr[rStart][cMid+1]&& tar <=arr[rStart][col-1]) {
    return bs(arr, rStart, cMid+1, col-1, tar);
  }
  if (tar<=arr[rStart+1][cMid+1]&& tar <=arr[rStart][col-1]) {
    return bs(arr, rStart+1, cMid+1, col-1, tar);
  }
  else {
    return bs(arr, rStart+1, 0, cMid-1, tar);
  }
}
}
