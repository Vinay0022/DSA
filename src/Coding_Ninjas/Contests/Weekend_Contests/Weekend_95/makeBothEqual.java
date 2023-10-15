public class makeBothEqual{
public static void main(String[]args){
String s = "tethqm";
String t = "hqmasbf";
System.out.println(sol(s,t));

}
public static int sol(String s ,String t) {
boolean isTrue = false;
for (int i = 0; i < t.length(); i++) {
if (s.contains(t)) {
isTrue = true;
}else{
    isTrue = false;
}
}
if (isTrue) {
return 1;
}
return 0;
}

}
