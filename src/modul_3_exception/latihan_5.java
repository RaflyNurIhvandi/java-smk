package modul_3_exception;
import java.io.*;

public class latihan_5 {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Demo Stream 3 | Rafly Nur Ihvandi");
        System.out.println("===================================");
        System.out.print("Ketik : ");
        data = (char) buff.read();
        while (data != '\r') {
            str += data;
            data = (char)buff.read();
        }
        System.out.println("Yang diketik : " + str);
        System.out.println("Program Selesai");
    }
}
