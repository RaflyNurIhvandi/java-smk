package modul_1;

public class tugas_2 {
    public static void main(String[] args) {
        // method replace
        System.out.println("Method replace");
        System.out.println("");
        String kalimat1 = "Namaku adalah Rafly Nur Ihvandi";
        System.out.println("Tanpa replace : "+kalimat1);
        System.out.println("Dengan replace : "+kalimat1.replace("Namaku adalah", "Aku Sebagai"));
        System.out.println("=======================================================");
        // method trim
        System.out.println("Method trim");
        System.out.println("");
        String kalimat2 = " Namaku adalah Rafly Nur Ihvandi";
        System.out.println(kalimat2);
        System.out.println(kalimat2.trim());
    }
}
