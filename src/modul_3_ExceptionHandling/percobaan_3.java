package modul_3_ExceptionHandling;

public class percobaan_3 {
    public static void main(String[] args) {
        // error
        // int bil = 10;
        // System.out.println(bil / 0);

        int bil = 10;

        // pembetulan_1 program
        try {
            System.out.println(bil / 0);
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }

        // pembetulan_2 program
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi Aritmatika error");
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }

    }
}
