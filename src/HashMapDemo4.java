import java.util.HashMap;

public class HashMapDemo4 {
    public static void main(String[] args) {
        HashMap<Integer , String> hm=new HashMap<>();
        System.out.println(hm.isEmpty()); //true
        // Homogeneous objects
        hm.put(101,"ravi");
        hm.put(102,"kapoor");
        hm.put(103,"ramesh");
        hm.put(104,"ramu");
        hm.put(105,"raushan");
        System.out.println("hm=" +hm);
        System.out.println("size=" +hm.size());
        System.out.println(hm.get(104));
        hm.remove(105);
        System.out.println("hm= " +hm);
        System.out.println(hm.containsValue("raushan"));
        System.out.println(hm.isEmpty());  //False
        System.out.println("size=" +hm.size());
        hm.clear();
        System.out.println(hm);
    }
}
