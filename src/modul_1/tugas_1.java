package modul_1;

public class tugas_1 {
    public static void main(String[] args) {
        // satu parameter
        System.out.println("Satu Parameter");
        System.out.println("");
        String kalimat1 = "Namaku adalah Rafly Nur Ihvandi";
        System.out.println("Tanpa substring : "+kalimat1);
        System.out.println("Dengan substring : "+kalimat1.substring(14));
        System.out.println("=============================================");
        // dua parameter
        System.out.println("Dua Parameter");
        System.out.println("");
        String kalimat2 = "Namaku adalah Rafly Nur Ihvandi";
        System.out.println("Tanpa substring : "+kalimat2);
        System.out.println("Dengan substring : "+kalimat2.substring(3, 19));
    }
}
