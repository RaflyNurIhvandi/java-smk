package modul_2_java_colection;

import java.util.*;

public class tugas_3 {
    public static void main(String[] args) {
        System.out.println("Tugas 1 Rafly Nur Ihvandi (07)\n");
        
        // HashMap
        Map<String, String> map1 = new HashMap<String, String>();
        System.out.println("HashMap :");
        map1.put("1", "Rafly");
        map1.put("2", "Reza");
        map1.put("3", "Sindu");
        map1.put("4", "Ramzi");
        map1.put("5", "Diva");
        map1.put("6", "Rengga");
        System.out.println(map1);
        System.out.println("=======================================================\n");

        // LinkedHashMap
        Map<String, String> map2 = new LinkedHashMap<String, String>();
        System.out.println("LinkedHashMap :");
        map2.put("1", "Rafly");
        map2.put("2", "Reza");
        map2.put("3", "Sindu");
        map2.put("4", "Ramzi");
        map2.put("5", "Diva");
        map2.put("6", "Rengga");
        System.out.println(map2);
        System.out.println("=======================================================\n");

        // TreeMap
        Map<String, String> map3 = new TreeMap<String, String>();
        System.out.println("TreeMap :");
        map3.put("1", "Rafly");
        map3.put("2", "Reza");
        map3.put("3", "Sindu");
        map3.put("4", "Ramzi");
        map3.put("5", "Diva");
        map3.put("6", "Rengga");
        System.out.println(map3+"\n");
        // remove
        System.out.println("Remove :");
        map3.remove("3");
        System.out.println(map3+"\n");
        // memanggil data
        System.out.println(map3.get("0123"));
        System.out.println("=======================================================\n");
    }
}
