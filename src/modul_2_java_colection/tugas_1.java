package modul_2_java_colection;

import java.util.*;

public class tugas_1 {
    public static void main(String[] args) {
        System.out.println("Tugas 1 Rafly Nur Ihvandi (07)\n");

        // HashSet
        Set<String> hashset = new HashSet<>();
        System.out.println("HashSet :");
        hashset.add("Rafly");
        hashset.add("Reza");
        hashset.add("Sindu");
        hashset.add("Diva");
        hashset.add("Ramzi");
        hashset.add("Rengga");
        System.out.println(hashset+"\n");

        // LinkedHashSet
        Set<String> linkedhashset = new LinkedHashSet<>();
        System.out.println("LinkedHashSet :");
        linkedhashset.add("Rafly");
        linkedhashset.add("Reza");
        linkedhashset.add("Sindu");
        linkedhashset.add("Diva");
        linkedhashset.add("Ramzi");
        linkedhashset.add("Rengga");
        System.out.println(linkedhashset+"\n");

        // TreeSet
        Set<String> treeset = new TreeSet<>();
        System.out.println("TreeSet :");
        treeset.add("Rafly");
        treeset.add("Reza");
        treeset.add("Sindu");
        treeset.add("Diva");
        treeset.add("Ramzi");
        treeset.add("Rengga");
        System.out.println(treeset+"\n");
    }
}
