package ArraylistDemo;

import java.util.ArrayList;

public class SetArray {
    public static void main(String[] args) {
        ArrayList<Double> al=new ArrayList<Double>();
        al.add(56.56);
        al.add(89.56);
        al.add(89.63);
        al.add(89.36);
        System.out.println("al="+al);
        al.set(0,23.23);
        System.out.println("al="+al);

    }
}
