package modul_2_java_colection;
import java.util.*;
public class latihan_1_array_list {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan bilangan bulat
        ArrayList <Integer> numbers = new ArrayList<>();

        // Menambahkan elemen ke ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Mendapatkan elemen dari ArrayList berdasarkan indeks
        int fristElement = (int) numbers.get(0);
        System.out.println("Frist Element : " + fristElement);
        // Menghapus elemen dari ArrayList
        numbers.remove(1);

        // literasi melalui ArrayList
        System.out.print("Element in ArrayList : ");
        for(int num : numbers){
            System.out.print(num + " ");
        }
    }
}
