public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> hs=new java.util.HashSet<>();
        hs.add("amol");
        hs.add("Aarav");
        hs.add("aditi");
        hs.add("arjun");
        hs.add("divya");
        hs.add("kiran");
        System.out.println(hs);
        hs.add("amol");
        System.out.println(hs);
    }
}
