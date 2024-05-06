package ArraylistDemo;

import java.util.ArrayList;

public class RemoveList {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("shyam");
        al.add("kapoor");
        al.add("tripathi");
        al.add("sabaz");
        al.add("somya");
        al.add("pooja");
        System.out.println("al="+al);
        al.remove(1);
        System.out.println("al="+al);
        al.remove("sabaz");
        System.out.println("al="+al);

    }
}
