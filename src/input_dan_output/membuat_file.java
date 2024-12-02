package input_dan_output;

import java.io.File;
import java.io.IOException;

public class membuat_file {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/dir_raflynurihvandi/IO_raflynurihvandi.txt");
        if (f.exists()) {
            System.out.println("File sudah ada");
        } else {
            f.createNewFile();
            System.out.println("Sukses membuat file baru");
        }
    }
}
