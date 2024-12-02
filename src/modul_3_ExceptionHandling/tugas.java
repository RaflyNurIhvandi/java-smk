package modul_3_ExceptionHandling;

public class tugas {
    public static void main(String[] args) {
        // try catch
        System.out.println("Try Catch by Rafly Nur Ihvandi");
        try {
            int a = 2023 / 0;
            System.out.println("Variabel a : " + a);
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan Pada : " + e + "\n");
        }

        // try finally
        System.out.println("try finally by Rafly Nur Ihvandi");
        try {
            int b = 2023 / 0;
            System.out.println("Variabel b : " + b);
        } catch (Exception e) {
            System.out.println("Terjadi Kesalahan Pada : " + e);
        } finally {
            System.out.println("Finally tetap dieksekusi meskipun kode pada try error\n");
        }

        // throw
        System.out.println("throw by Rafly Nur Ihvandi");
        try {
            throw new Exception("Ini adalah kesalahan yang dibuat oleh throw");
        } catch (Exception e) {
            System.out.println("Pesan Kesalahan = " + e + "\n");
        }

        // throws
        System.out.println("throws by Rafly Nur Ihvandi");
        try {
            f();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void f() throws NullPointerException, ArrayIndexOutOfBoundsException {
        throw new NullPointerException();
    }
    // end throws
}
