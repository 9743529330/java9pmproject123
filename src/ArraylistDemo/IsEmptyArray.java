package ArraylistDemo;

import java.util.ArrayList;

public class IsEmptyArray {
    public static void main(String[] args) {
        ArrayList<Double> al=new ArrayList<Double>();
        System.out.println(al.isEmpty());
        al.add(32.69);
        al.add(85.36);
        al.add(98.58);
        al.add(58.56);
        System.out.println("al="+al);
        System.out.println(al.isEmpty());
        al.clear();
        System.out.println(al.isEmpty());
    }
}
