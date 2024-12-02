package input_dan_output;

import java.io.FileWriter;
import java.io.IOException;

public class menulis_file {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/dir_raflynurihvandi/IO_raflynurihvandi.txt");
        fw.write("Nama : Rafly Nur Ihvandi \n");
        fw.write("Kelas : XII RPL C \n");
        fw.write("No. Absen : 07 \n");
        fw.write("Saya adalah seorang developer");
        fw.close();
        System.out.println("Berhasil....");
    }
}
