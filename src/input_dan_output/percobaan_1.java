package input_dan_output;
import java.io.*;
public class percobaan_1 {
    public static void main(String[] args) {
        String dirname = "D:/java";
        File f1 = new File(dirname);
        if(f1.isDirectory()){
            System.out.println("Directory of "+dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + dirname);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is a not directory");
        }
    }
}
