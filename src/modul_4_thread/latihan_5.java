package modul_4_thread;

public class latihan_5 {
    public static void main(String[] args) {
        Thread celana1 = new Thread(new Celana("Celana-1"));
        Thread celana2 = new Thread(new Celana("Celana-2"));
        celana1.start();
        celana2.start();
    }
}
class Celana implements Runnable{
    String nama;
    public Celana(String id){
        nama = id;
    }
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (Exception e) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread "+nama+": Posisi"+i);
        }
    }
}
