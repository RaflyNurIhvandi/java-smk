package input_dan_output;

import java.io.File;

public class membaca_direktori {
    public static void main(String[] args) {
        File dir = new File("D:/dir_raflynurihvandi");
        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            for(File f : files)
            System.out.println(f.getName());
        }
    }
}
