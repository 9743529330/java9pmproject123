import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(44);
        al.add(46);
        al.add(48);
        al.add(40);
        al.add(47);
        al.add(41);
        al.add(43);
        al.add(49);
        al.add(42);
        al.add(45);
        al.add(46);
        System.out.println("al="+al);
        //al.removeAll(al);
       // System.out.println("al2="+al);
        al.isEmpty();
        //System.out.println(al);
       // System.out.println("al3=" +al);
        al.removeIf(x->(x%2==0));
        System.out.println("al4="+al);






    }
}
