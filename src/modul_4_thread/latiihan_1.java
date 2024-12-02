package modul_4_thread;

public class latiihan_1 {
    public static void main(String[] args) {
        int jumlah = 10;
        Thread thread = new Thread(){
            public void run(){
                try {
                    for (int i = 0; i <= jumlah; i++) {
                        System.out.println("Nomor : "+i);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
