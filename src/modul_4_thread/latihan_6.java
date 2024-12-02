package modul_4_thread;

public class latihan_6 {
    public static void main(String[] args) {
        int i;
        int a;

        Thread kopasus = new Thread();
        kopasus.start();
        while (true) {
            for (int j = 0; j <= 20; j++) {
                System.out.println("Pasukan Kopasus Berhasil Menyelamatkan Ibu Hamil ke : " + j);
                try {
                    kopasus.sleep(1000);
                } catch (Exception e) {
                    e.getStackTrace();
                }
                if (j == 20) {
                    System.out.println("Pasukan Marinir Datang ke TKP");
                }
                Thread marinir = new Thread();
                marinir.start();
                for (int u = 0; u <= 50; u++) {
                    System.out.println("Pasukan Marinir Berhasil Membunuh Teroris Ke : " + u);
                    if (u <= 20) {
                        System.out.println("Pasukan Kopasus Berhasil Menyelamatkan Warga Manula Ke : " + u);
                    }
                    try {
                        marinir.sleep(1000);
                    } catch (Exception e) {
                        e.getStackTrace();
                    }
                    if (u == 50) {
                        System.out.println("Pasukan Infanteri Datang ke TKP ");
                    }
                }
            }
            break;
        }
    }
}
