package modul_3_exception;

public class latihan_2 {
    public static void methodLain() { 
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        }catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("Penanganan exception dalam method method Lain()");
        throw e;
        }
    }
    public static void main(String[] args) {
        System.out.println("Penggunaan Throw");
        System.out.println("==================");
        try{
            methodLain();
        }catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Penanganan exception dalam method main()");
        }
    }
}
