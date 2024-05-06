package Collections;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
    ArrayList<String> al=new ArrayList<>();
        al.add("lohan");
        al.add("hohan");
        al.add("fohan");
        al.add("qohan");
        al.add("wohan");
        al.add("dohan");
        al.add("aohan");
        al.add("sohan");
        System.out.println("al="+al);

        ArrayList<String> al2=new ArrayList<>();
        al2.add("mohan");
        al2.add("sohan");
        al2.add("raju");
        al2.add("saryu");
        al2.add("yummy");
        System.out.println("al2="+al2);

        al2.addAll(al);
        System.out.println("al2="+al2);
        al2.removeAll(al);
        System.out.println("al2="+al2);






    }

}
