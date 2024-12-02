package modul_2_java_colection;

import java.util.HashSet;

public class latihan_1_hashset {
    public static void main(String[] args) {

        // Membuat HashSet untuk menyimpan nama-nama buah
        HashSet<String> fruits = new HashSet<>();

        // Menambahkan elemen ke HashSet
        fruits.add("Apel");
        fruits.add("Jeruk");
        fruits.add("Mangga");

        // Menghapus elemen dari HashSet
        fruits.remove("Jeruk");
        
        // Iterasi melalui HashSet
        System.out.print("Fruits in HashSet: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }

    }
}
