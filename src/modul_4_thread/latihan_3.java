package modul_4_thread;
import static java.lang.Thread.sleep;
public class latihan_3 implements Runnable {
    int jumlah = 10;

    public static void main(String[] args) {
        latihan_3 test = new latihan_3();
        test.run();
    }

    @Override
    public void run() {
        try {
            for (int w = 1; w <= jumlah; w++) {
                System.out.println("ID : "+w);
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
