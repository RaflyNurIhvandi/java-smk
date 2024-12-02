package modul_3_exception;

import java.io.*;

public class latihan_4 {
    public static void main(String[] args) {

        // Demo Stream 1
        System.out.println("Demo Stream 1 | Rafly Nur Ihvandi");
        System.out.println("===================================");
        byte[] data = new byte[10];
        System.out.print("Masukkan data : ");
        try {
            System.in.read(data);
        } catch (IOException e) {
            System.out.print("Terjadi Exception");
        }
        System.out.print("Yang anda ketik : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }

        // Demo Stream 2
        System.out.println("\nDemo Stream 2 | Rafly Nur Ihvandi");
        System.out.println("===================================");
        int panjang = 0;
        System.out.print("Masukkan data : ");
        try {
            panjang = System.in.read(data);
            System.out.print("Yang anda ketik : ");
            System.out.write(data);
            System.out.println("Panjang Karakter : " + panjang);
            System.out.print("index ke-1 sebnyk 3 : ");
            System.out.write(data, 1, 3);
            System.out.println('\n');
        } catch (IOException e) {
            System.out.print("Terjadi Exception");
        }
    }
}
