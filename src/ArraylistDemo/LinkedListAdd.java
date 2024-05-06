package ArraylistDemo;

import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("amol");
        ll.add("amit");
        ll.add("mohan");
        ll.add("kapoor");
        ll.add("arvind");
        System.out.println("ll="+ll);
        ll.addFirst("first");
        ll.addLast("last");
        System.out.println("ll="+ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll="+ll);


    }
}
