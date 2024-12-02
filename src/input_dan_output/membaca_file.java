package input_dan_output;

import java.io.FileReader;

public class membaca_file {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("D:/dir_raflynurihvandi/IO_raflynurihvandi.txt");
            int i;
            while ((i=fr.read())!=-1)
            System.out.print((char)i);
            fr.close();
            System.out.println();
        } catch (Exception e) {
            System.out.println("File tidak ditemukan");
        }
    }
}
