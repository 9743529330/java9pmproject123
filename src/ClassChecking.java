public class ClassChecking {
    int a;
    double d;
    char c;
    String str;
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);

    }
    ClassChecking()
    {

        a=23;
        d=22.35;
        c='m';
        str="amol sir";

    }

    public static void main(String[] args) {
        ClassChecking ob=new ClassChecking();
        ob.display();


    }
}
