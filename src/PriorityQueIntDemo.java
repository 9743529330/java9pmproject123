import java.util.PriorityQueue;

public class PriorityQueIntDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(60);
        pq.offer(35);
        pq.offer(10);
        pq.offer(40);
        pq.offer(5);
        pq.offer(01);
        pq.offer(15);
        pq.offer(20);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());





    }
}
