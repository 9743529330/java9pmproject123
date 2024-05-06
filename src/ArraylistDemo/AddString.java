package ArraylistDemo;

import java.util.ArrayList;

public class AddString {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("amol");
        al.add("mithlesh");
        al.add("mohan");
        al.add("kapoor");
        System.out.println("al="+al);
        ArrayList<String> al2=new ArrayList<>();
        al2.addAll(al);
        System.out.println("al2="+al2);
    }
}
