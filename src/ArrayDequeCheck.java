import java.util.ArrayDeque;

public class ArrayDequeCheck {
    public static void main(String[] args) {
        ArrayDeque<String> adq=new ArrayDeque<>();
        adq.offer("amol");
        adq.offer("ansh");
        adq.offer("somya");
        adq.offer("mannat");
        adq.offer("pooja");
        System.out.println(adq);
        adq.offerFirst("rajeev");
        adq.offerLast("anurudh");
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq);

    }
}
