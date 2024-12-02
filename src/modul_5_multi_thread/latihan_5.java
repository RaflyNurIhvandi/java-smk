package modul_5_multi_thread;

public class latihan_5 {
    public static void main(String[] args) {
        Topi Topi1 = new Topi("Topi-1");
        Topi Topi2 = new Topi("Topi-2");
        Topi1.start();
        Topi2.start();
    }
}
class Topi extends Thread{
    public Topi (String id){
        super(id);
    }
    @Override
    public void run(){
        String nama = getName();
        for (int i = 0; i < 7; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread "+nama+":Posisi "+i);
        }
    }
}
