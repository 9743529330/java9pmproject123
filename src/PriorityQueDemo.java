import java.util.PriorityQueue;

public class PriorityQueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.offer("amol");
        pq.offer("amit");
        pq.offer("mamta");
        pq.offer("madhu");
        pq.offer("suraj");
        pq.offer("sony");
        pq.offer("rahul");
        pq.offer("tejan");
        pq.offer("rajesh");
        pq.offer("sneha");
        pq.offer("vikram");
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq);



    }
}
