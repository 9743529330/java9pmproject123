package Inheritance;

public class Division {
    public static void main(String[] args) {
        int a=10;
        int b=3;
       // double c=a/b; //c=3.0
        double c=(double)a/b;// 1.if you want to store one type of value into another type
        //the write that type into round brackets in front of
        //value to be stored this is known as type-casting
        System.out.println("c="+c);
    }
}
