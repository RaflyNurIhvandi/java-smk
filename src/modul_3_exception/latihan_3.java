package modul_3_exception;

public class latihan_3 {
    public static void main(String[] args) {
        System.out.println("Demo Finally");
        System.out.println("===============");
        int x = 3;
        int [] arr = {10,11,12}; 
        try {
            System.out.println(arr[x]); 
            System.out.println("Tidak terjadi exception");
        }catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Terjadi exception"); 
            System.out.println(arr[x-4]);
        }
        finally {
            System.out.println("Program Selesai");
        }
    }
}
