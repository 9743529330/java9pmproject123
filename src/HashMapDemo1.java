import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        // Homogeneous records
        hm.put(101,"amol");
        hm.put(102,"sneha");
        hm.put(103,"rahul");
        hm.put(104,"priya");
        hm.put(105,"ananya");
        //Heterogeneous Recors
        hm.put(201,"john doe");
        hm.put("keystring",3.14);
        hm.put(3.14,"true");
        hm.put(2.65,"john doe");
        hm.put("object keys","john doe");
        System.out.println(hm);



    }
}
