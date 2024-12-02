package input_dan_output;

import java.io.File;

public class membuat_direktori {
    public static void main(String[] args) {
        File f = new File("D:/dir_raflynurihvandi");
        if (f.exists()) {
            System.out.println("Direktori sudah ada");
        } else {
            f.mkdir();
            System.out.println("Sukses membaut folder / direktori baru");
        }
    }
}
