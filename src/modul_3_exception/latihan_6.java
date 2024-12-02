package modul_3_exception;

import java.io.*;

public class latihan_6 {
    public static void main(String[] args) {
        System.out.println("Create File by Rafly Nur Ihvandi");
        System.out.println("==================================");
        byte data;
        String namaFile = "test_create_file.txt";
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(namaFile, true);
            System.out.print("Ketik : ");
            data = (byte) System.in.read();
            while (data != (byte) '\r') {
                fout.write(data);
                data = (byte) System.in.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + namaFile + " tidak dapat dicreate");
        } catch (IOException e) {
            System.out.println("Terjadi Exception");
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Terjadi Exception");
                }
            }
        }
    }
}
