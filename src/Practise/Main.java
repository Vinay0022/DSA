import java.util.Map;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> hm = new Hashtable<>();
        hm.put("A", 1);
        hm.put("B", 2);
        hm.put("C", 3);
        hm.put("D", 4);

        Hashtable<String, Integer> ht2 = new Hashtable<>(hm);
        System.out.println(ht2);
    }

}
