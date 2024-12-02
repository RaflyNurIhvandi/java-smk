package modul_4_thread;

public class latihan_2 {
    Thread thread;
    int jumlah = 7;
    public static void main(String[] args) {
        latihan_2 test = new latihan_2();
        test.proses_satu();
        test.proses_dua();
    }
    void proses_satu(){
        thread = new Thread(){
            public void run(){
                try {
                    for (int i = 1; i <= jumlah; i++) {
                        System.out.println("Nomor : "+i);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
    void proses_dua(){
        thread = new Thread(){
            public void run(){
                try {
                    for (int i = 1; i <= jumlah; i++) {
                        System.out.println("Salam Programmer");
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
