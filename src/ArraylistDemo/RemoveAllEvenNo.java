package ArraylistDemo;

import java.util.ArrayList;

public class RemoveAllEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(56);
        al.add(53);
        al.add(45);
        al.add(13);
        al.add(52);
        al.add(98);
        al.add(100);
        al.add(120);
        al.add(19);
        System.out.println(al);
        al.removeIf(i->(i%5!=0));
        {
            System.out.println("al="+al);
        }

    }
}
