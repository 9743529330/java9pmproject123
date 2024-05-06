package ArraylistDemo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class PrintedArray {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Amol");
        al.add("amit");
        al.add("mohan");
        al.add("sohan");
        al.add("priti");
        al.add("pooja");
        System.out.println(al);
        System.out.println("size="+al.size());
        System.out.println("--> Printed Array list >>");
        for (int i=0;i<al.size();i++)
            System.out.println(al.get(i));
        System.out.println("--> Printed Array for Each loop >>");
        for (String str:al)
            System.out.println(str);
        System.out.println("--> printed Array using Iterator >>");
        Iterator itr=al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        System.out.println("--> printed Arraylist using Enumeration >>");

    }
}
