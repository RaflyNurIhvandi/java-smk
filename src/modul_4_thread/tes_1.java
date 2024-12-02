package modul_4_thread;

public class tes_1 {
    public static void main(String[] args) throws InterruptedException {
        Thread tUtama = Thread.currentThread();

        // menampilkan informasi tentang thread
        System.out.print("Informasi awal : ");
        System.out.println(tUtama.toString());

        // Mengganti nama thread
        tUtama.setName("Thread Utama");

        // Menampilkan kembali info tentang thread
        System.out.print("Setelah diubah namanya : ");
        System.out.println(tUtama.toString());
        for (int i = 0; i < 5; i++) {
            System.out.println("Detik ke - "+(i+1));
            Thread.sleep(1000);
        }
    }
}
