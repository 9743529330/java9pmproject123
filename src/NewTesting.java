public class NewTesting {
    int a;
    double d;
    char c;
    String str;
    NewTesting()
    {
a=20;
d=25.25;
c='k';
str="my name is sony";
    }
    void display()
    {
        System.out.println("a=" +a);
        System.out.println("d=" +d);
        System.out.println("c=" +c);
        System.out.println("str=" +str);

    }

    public static void main(String[] args) {
        int x;
        x=10;
        System.out.println(x);
        NewTesting ob=new NewTesting();
       ob.a=20;
        ob.d=45.25;
        ob.c='m';
        ob.str="my name is sonu";
        ob.display();

    }

}
