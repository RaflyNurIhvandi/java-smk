package modul_1;

public class latihan_8 {
    public static void main(String[] args) {
        String str = "Ilmu Komputer UGM";
        char [] arraystr = str.toCharArray();
        System.out.println("String : "+ str);
        System.out.println("String Baru [toCharArray]: ");
        for (int i = 0; i < arraystr.length; i++) {
            System.out.println(arraystr[i]);
        }
        System.out.println("String Baru [getChars]: ");
        char[] getstr = new char[10];
        str.getChars(5, 13, getstr, 0);
        for (int i = 0; i < getstr.length; i++) {
            System.out.println(getstr[i]);
        }
    }
}
