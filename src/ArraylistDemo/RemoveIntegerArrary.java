package ArraylistDemo;

import java.util.ArrayList;

public class RemoveIntegerArrary {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(53);
        al.add(56);
        al.add(85);
        al.add(125);
        al.add(352);
        al.add(457);
        System.out.println("al="+al);
        al.removeIf(integer -> (integer.intValue()<5));
         System.out.println("al="+al);

    }
}
