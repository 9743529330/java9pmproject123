import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v=new Vector<>();
        System.out.println("capacity=" +v.capacity());
        System.out.println("size="+v.size());
        v.add("amol");
        v.add("mamta");
        v.add("mohit");
        v.add("priti");
        v.add("sathya");
        v.add("monto");
       /* v.add("mithlesh");
        v.add("motu");
        v.add("priya");
        v.add("moon");
        v.add("sarso");
        v.add("amol");
        v.add("mamta");
        v.add("mohit");
        v.add("priti");
        v.add("sathya");
        v.add("monto");
        v.add("mithlesh");
        v.add("motu");
        v.add("priya");
        v.add("surya"); */

        System.out.println("capacity="+v.capacity());
        System.out.println("size="+v.size());
       /* Iterator itr=v.iterator();
        while (itr.hasNext())
            System.out.println(itr.next()); */ //new method of vector Api

        Enumeration e=v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement()); //old method of vector Api

    }
}
