package modul_2_java_colection;
import java.util.*;
public class latihan_3 {
    public static void main(String[] args) {
        // HashMap
        System.out.println("HashMap");
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("0001", "Sofia");
        map1.put("0654", "Haikal");
        map1.put("4003", "Raisya");
        map1.put("0123", "Panji");
        map1.put("43792", "Ivana");
        map1.put("74501", "Ridwan");
        System.out.println(map1);

        // LinkedHashMap
        System.out.println("LinkedHashMap");
        Map<String, String> map2 = new LinkedHashMap<String, String>();
        map2.put("0001", "Sofia");
        map2.put("0654", "Haikal");
        map2.put("4003", "Raisya");
        map2.put("0123", "Panji");
        map2.put("43792", "Ivana");
        map2.put("74501", "Ridwan");
        System.out.println(map2);

        // TreeMap
        System.out.println("TreeMap");
        Map<String, String> map3 = new TreeMap<String, String>();
        map3.put("0001", "Sofia");
        map3.put("0654", "Haikal");
        map3.put("4003", "Raisya");
        map3.put("0123", "Panji");
        map3.put("43792", "Ivana");
        map3.put("74501", "Ridwan");
        System.out.println(map3);
        // remove
        map3.remove("4003");
        System.out.println(map3);
        // memanggil data
        System.out.println(map3.get("0123"));
    }
}
