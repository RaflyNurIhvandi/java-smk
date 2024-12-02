package modul_5_multi_thread;

public class latihan_4 {
    public static void main(String[] args) {
        Thread buku1 = new Thread(new Buku("Buku-1"));
        Thread buku2 = new Thread(new Buku("Buku-2"));
        buku1.start();
        buku2.start();
    }
}
class Buku implements Runnable{
    String nama;
    public Buku(String id){
        nama = id;
    }
    public void run(){
        for (int i = 0; i < 9; i++) {
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException ie) {
                System.out.println("Terinterupsi");
            }
            System.out.println("Thread "+nama+":Posisi"+i);
        }
    }
}
