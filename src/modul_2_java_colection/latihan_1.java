package modul_2_java_colection;
import java.util.*;
public class latihan_1 {
    public static void main(String[] args) {
        // HashSet
        Set<String> set1 = new HashSet<>();
        System.out.println("HashSet :");
        set1.add("081233");
        set1.add("082221");
        set1.add("083556");
        set1.add("081334");
        set1.add("088854");
        set1.add("083577");
        System.out.println(set1);
        System.out.println("=================================================");

        // LinkedHahSet
        Set<String> set2 = new LinkedHashSet<>();
        System.out.println("LinkedHashSet :");
        set2.add("081233");
        set2.add("082221");
        set2.add("083556");
        set2.add("081334");
        set2.add("088854");
        set2.add("083577");
        System.out.println(set2);
        System.out.println("=================================================");

        // TreeSet
        Set<String> set3 = new TreeSet<>();
        System.out.println("TreeSet :");
        set3.add("081233");
        set3.add("082221");
        set3.add("083556");
        set3.add("081334");
        set3.add("088854");
        set3.add("083577");
        System.out.println(set3);
        // System.out.println("=================================================");
    }
}
