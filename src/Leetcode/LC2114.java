/**
 * nothing
 */
public class LC2114 {

  public static void main(String[] args) {
    String [] sentences = {"t qnnbpqul iuzejkwniruscnvkdwgmvdajbgmbytioldkixld","uqcnehvw nn idofvpqwrmsnygsgyijxearenslmbbsxxqykhnwbavkhszazrvuywtubispckkymswtdgpfloqjdtx"};
System.out.println(sol(sentences));
  }
  public static int sol(String[]sentences) {
int max = 0;
  int submax =0;
for (int i = 0; i < sentences.length; i++) {
  for (int j = 0; j < sentences[i].length(); j++) {
    if (sentences[i].charAt(j)==' ') {
     max++; 
     submax = Math.max(submax, max);
    }
  }
  max = 0;
}    
submax +=1;
return submax;
  }
}