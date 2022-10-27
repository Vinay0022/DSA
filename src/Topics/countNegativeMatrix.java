package Topics;

public class countNegativeMatrix {
public static void main(String[] args) {
 int[][] grid = {
 {4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3} 
 }; 
 int ans2 =ans(grid);
 System.out.println(ans2);
}

private static int ans(int[][] grid) {
  int rows = grid.length;
  int cols = grid[0].length;
  int res = 0; 
  int lastNeg = cols - 1;
  for (int row = 0; row < rows; row++) {
    //check edge cases - if first element in the row is negative means all the elements in the row is -ve;
    if (grid[row][0]<0) {
      res += cols; 
      continue;
    } 
    //if the last element of the row is +ve means there is no -ve elements in the row
    if (grid[row][cols-1]>0) {
      continue; 
    }
    //there is a mix of negative and +ve ones, need to find the border. starting
    //binary search
    int l = 0;
    int r = lastNeg;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (grid[row][mid] < 0) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
     //l points to the first -ve element, which means cols -1 is a number of such elements
     res += (cols - l);
     lastNeg = l;
    
  }
  return res;
}  

}
