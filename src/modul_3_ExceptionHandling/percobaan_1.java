package modul_3_ExceptionHandling;

public class percobaan_1 {
    public static void main(String[] args) {
        // error
        // int a[]=new int[5];
        // a[5]=100;

        // pembetulan
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (Exception e) {
            System.out.println("Terjadi pelanggaran memory");
        }

    }
}
