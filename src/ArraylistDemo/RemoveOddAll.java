package ArraylistDemo;

import java.util.ArrayList;

public class RemoveOddAll {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(154);
        al.add(156);
        al.add(224);
        al.add(143);
        al.add(163);
        al.add(139);
        System.out.println("al="+al);
        //remove all the elements which are odd numbers
        //int i=10;
        al.removeIf(i->(i%2!=0));
        System.out.println("al="+al);
    }
}
