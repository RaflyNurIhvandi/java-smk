package modul_2_java_colection;

import java.util.*;

public class tugas_2 {
    public static void main(String[] args) {
        System.out.println("Tugas 1 Rafly Nur Ihvandi (07)\n");

        // ArrayList
        List<String> list = new ArrayList<String>();
        System.out.println("Array List : ");
        list.add("Rafly");
        list.add("Reza");
        list.add("Sindu");
        list.add("Diva");
        list.add("Ramzi");
        list.add(1, "Rengga");
        System.out.println(list+"\n");
        // remove
        System.out.println("Remove : ");
        list.remove(2);
        System.out.println(list);
        System.out.println("============================================================\n");

        // LinkedList dengan Queue
        Queue<String> qu = new LinkedList<String>();
        System.out.println("LinkedList Queue : ");
        qu.add("Rafly");
        qu.add("Reza");
        qu.add("Sindu");
        qu.add("Diva");
        qu.add("Ramzi");
        qu.add("Rengga");
        System.out.println(qu+"\n");
        // remove
        System.out.println("Remove : ");
        qu.remove("Diva");
        System.out.println(qu+"\n");
        // mengambil data
        System.out.println("Mengambil Data : ");
        System.out.println(qu.element());
        System.out.println("============================================================\n");

        // ProirityQueue
        Queue<String> qu2 = new PriorityQueue<String>();
        System.out.println("PriorityQueue : ");
        qu2.add("Rafly");
        qu2.add("Reza");
        qu2.add("Sindu");
        qu2.add("Diva");
        qu2.add("Ramzi");
        qu2.add("Rengga");
        System.out.println(qu2);
        System.out.println("============================================================\n");
    }
}
