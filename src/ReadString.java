import java.util.Scanner;

public class ReadString {
    public static void main(String[] args) {
        int i;
        char c;
        double d;
        String str;
        float f;
        boolean b;
        b=true;
        c='m';
        str="my name is rahul";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter interger value=");
        i=sc.nextInt();
        System.out.println("i ="+i);
       //System.out.println("enter c=");
        //c=sc.nextLine().charAt(0);
        //System.out.println("c=" +c);
        System.out.println("enter double =");
        d=sc.nextDouble();
        System.out.println("d="+d);
        System.out.println("enter str=");
        str=sc.nextLine();
        System.out.println("str="+str);
        System.out.println("enter b=");
        b=sc.hasNextBoolean();
        System.out.println("b="+b);

    }
}
