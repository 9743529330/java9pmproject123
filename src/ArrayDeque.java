public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<String> adq=new java.util.ArrayDeque<>();
        adq.offer("Amol");
        adq.offer("sneha");
        adq.offer("rahul");
        adq.offer("priya");
        adq.offer("ananya");
        adq.offer("vikram");
        adq.offer("neha");
        adq.offer("rajesh");
        adq.offer("pooja");
        adq.offer("amit");
        System.out.println(adq);
        adq.offer("first");
        adq.offer("last");
        System.out.println(adq);
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());
        System.out.println(adq.poll());







    }
}
