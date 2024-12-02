package modul_4_thread;

public class tugas2 implements Runnable {
    public void run(){
        System.out.println("Rafly Thread Dieksekusi");
    }
}
class DemoImplementsRunnable {
    public static void main(String[] args) {
        
        // membuat objek dari class myRunnable
        tes_2 obj = new tes_2();

        // membuat objek dengan melewatkan objek Runnable
        Thread t = new Thread(obj);

        // menjalankan thread
        t.start();
        System.out.println("Rafly Nur Ihvandi Dieksekusi");
    }
}