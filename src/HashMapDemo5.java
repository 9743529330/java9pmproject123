import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo5 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(101,"amol");
        hm.put(102,"sneha");
        hm.put(103,"rahul");
        hm.put(104,"priya");
        hm.put(105,"ananya");
        hm.put(106,"shubham");
        System.out.println("hm=" +hm);
        Set s=hm.keySet();
        Collection values=hm.values();
        System.out.println("keyset=" +s);
        System.out.println("values=" +values);
        Set entrySet=hm.entrySet();
        System.out.println("entryset=" +entrySet);






    }
}
