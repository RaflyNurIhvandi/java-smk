package modul_5_multi_thread;

public class latihan_1 {
    public static void main(String[] args) {
        thread1 T1 = new thread1();
        thread2 T2 = new thread2();
        T1.start();
        T2.start();
    }
}
class thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("thread 1 running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException IE) {
                System.out.println("thread interupted");
            }
        }
    }
}
class thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread 2 running "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException IE) {
                System.out.println("thread interupted");
            }
        }
        System.out.println("thread 2 complete");
    }
}
