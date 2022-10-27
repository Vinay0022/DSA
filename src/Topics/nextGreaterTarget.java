package Topics;

public class nextGreaterTarget {
public static void main(String[] args) {
  char[] letters = {'c','f','j'};
  char target = 'c';
 System.out.println(nextgreatertarger(letters, target));
}  

public static char nextgreatertarger(char[]letters ,char targert) {
  int start = 0;
  int end = letters.length - 1;
  while (start<=end) {
   int mid = start + (end - start) / 2; 
   if (letters[mid]>targert) {
     end = mid - 1;
   }
   else{
     start = mid +1;
   }
  }
  return letters[start%letters.length];
}
}
