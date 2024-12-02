package modul_1;

public class latihan_4 {
    public static void main(String[] args) {
        String str1 = "Ilmu Komputer Matematika dan Ilmu Pengetahuan Alam Universitas Gajah Mada";
        System.out.println(str1.startsWith("Ilmu"));
        System.out.println(str1.endsWith("Ilmu"));
        System.out.println(str1.startsWith("lmu",1));
        System.out.println(str1.startsWith("lmu",2));
        System.out.println(str1.startsWith("lmu",3));
        System.out.println(str1.startsWith("Komp",7));
        System.out.println(str1.startsWith("Komp",6));
        System.out.println(str1.startsWith("Komp",5));
        System.out.println(str1.endsWith("Mada"));
        System.out.println(str1.startsWith("Mada"));
    }
}
