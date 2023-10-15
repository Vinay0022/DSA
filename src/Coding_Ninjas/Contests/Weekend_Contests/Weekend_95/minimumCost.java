import java.util.*;
public class minimumCost {
    public static void main(String[] args) {
        String s = "outwyu";
        //vowels = o u u= 3
        //consonants = t w y =3
        int x =3 ;
        int y =10 ;
        System.out.println(sol(s,x,y));
    }
    public static int sol(String s,int x,int y){
HashMap<Character,Character> vowels = new HashMap<>();

vowels.put('a','a');
vowels.put('e','e');
vowels.put('i','i');
vowels.put('o','o');
vowels.put('u','u');
int countv =0;
int countc = 0;
for (int i = 0; i < s.length(); i++) {
if (vowels.get(s.charAt(i))!=null) {
countv++;
}else{
countc++;
}
}
if(countv*x<countc*y){
return countv*x;
    }

return countc*y;

}
}
// golang,mongodb,react(can be replace by svelte)
