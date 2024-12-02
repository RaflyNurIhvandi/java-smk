package modul_5_multi_thread;
import java.util.logging.Level;
import java.util.logging.Logger;
public class latihan_3 implements Runnable {
    public static int countwriter = 0;
    public static int countreader = 0;
    public static final int READER = 0;
    public static final int WRITER = 0;
    private int type;
    private int id;
    private String strid;
    public latihan_3(int type){
        this.type = type;
        this.strid = (type == READER) ? ("Reader "+(this.id = ++countreader)) : ("Writer "+(this.id = ++countwriter));
    }
    public static void main(String[] args) {
        (new Thread(new latihan_3(READER))).start();
        (new Thread(new latihan_3(READER))).start();
        (new Thread(new latihan_3(WRITER))).start();
    }
    public void run(){
        if (type == READER) {
            read();
        } else if (type == WRITER){
            write();
        }
    }
    public void read(){
        System.out.println(strid+": start!");
        while (true) {
            System.out.println(strid+": reading!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(latihan_3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void write(){
        System.out.println(strid+": start!");
        while (true) {
            System.out.println(strid+": reading!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(latihan_3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
