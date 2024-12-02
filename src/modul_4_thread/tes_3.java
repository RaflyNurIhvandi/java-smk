package modul_4_thread;

public class tes_3 implements Runnable {
    public void run(){
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread "+ Thread.currentThread().getId() +": Iterasi "+ i);
            try {
                Thread.sleep(1000);
                // menghentikan thread selama 1 detik
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class RunnableExample{
    public static void main(String[] args) {
        tes_3 myRunnable = new tes_3();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);

        thread1.start();
        thread2.start();
    }
}