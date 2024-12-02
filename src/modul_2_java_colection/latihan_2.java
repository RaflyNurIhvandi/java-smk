package modul_2_java_colection;
import java.util.*;
public class latihan_2 {
    public static void main(String[] args) {
        // Array List
        System.out.println("Array List");
        List<String> list1 = new ArrayList<String>();
        list1.add("Pemrograman Berorientasi Objek");
        list1.add("Pemrograman Dasar");
        list1.add("Sistem Komputer");
        list1.add("Jaringan Dasar");
        list1.add("Android Studio");
        list1.add(1, "Pemrograman Web");
        System.out.println(list1);
        // remove
        list1.remove(2);
        System.out.println(list1);

        // linkedList menggunakan Queue
        System.out.println("LinkedList Queue");
        Queue<String> qu = new LinkedList<String>();
        qu.add("Pemrograman Berorientasi Objek");
        qu.add("Pemrograman Dasar");
        qu.add("Sistem Komputer");
        qu.add("Jaringan Dasar");
        qu.add("Android Studio");
        qu.add("Pemrograman Web");
        System.out.println(qu);
        // remove
        qu.remove("Sistem Komputer");
        System.out.println(qu);
        // mengambil data
        System.out.println(qu.element());

        // PriorityQueue
        System.out.println("PriorityQueue");
        Queue<String> qu2 = new PriorityQueue<String>();
        qu2.add("Pemrograman Berorientasi Objek");
        qu2.add("Pemrograman Dasar");
        qu2.add("Sistem Komputer");
        qu2.add("Jaringan Dasar");
        qu2.add("Android Studio");
        qu2.add("Pemrograman Web");
        System.out.println(qu2);
    }
}
