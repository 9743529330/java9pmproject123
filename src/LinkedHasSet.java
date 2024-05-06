import java.util.LinkedHashSet;

public class LinkedHasSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("amol");
        lhs.add("Aarav");
        lhs.add("aditi");
        lhs.add("arjun");
        lhs.add("divya");
        lhs.add("kiran");
        lhs.add("kiran");
        System.out.println(lhs); // linked hasset not add dublicate element.
    }
}
