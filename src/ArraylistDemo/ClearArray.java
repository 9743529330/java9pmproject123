package ArraylistDemo;

import java.util.ArrayList;

public class ClearArray {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("Amol");
        al.add("mohan");
        al.add("sohan");
        al.add("kapoor");
        al.add("teja");
        System.out.println("al="+al);
        al.clear();
        System.out.println("al="+al);
    }
}
