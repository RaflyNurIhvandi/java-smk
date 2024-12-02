package modul_3_exception;

public class latihan_1 {
    public static void main(String[] args) {
        // TryCatch1
        System.out.println("TryCatch1");
        System.out.println("================");
        try{
            int[] arr = new int[1]; 
            System.out.println(arr[1]);
            System.out.println("Baris ini tidak akan dieksekusi, karena statement baris diatas terjadi exception");
        }catch (ArrayIndexOutOfBoundsException e){ 
            System.out.println("Terjadi exception karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
        System.out.println("");

        // Trycatch2
        System.out.println("TryCatch2");
        System.out.println("================");
        try{
            int x = args.length; //banyak argumen / sama dengan 0
            int y = 100/x;
            int[] arr = {10,11}; 
            y = arr[x];
            System.out.println("Tidak terjadi exception");
        }catch (ArithmeticException e){ 
            System.out.println("Terjadi exeption karena pembagian dengan nol");
        }catch (ArrayIndexOutOfBoundsException e){ 
            System.out.println("Terjadi exeption karena indeks di luar kapasitas array");
        }
        System.out.println("Setelah blok try catch");
    }
}
