package InheritanceDemo;

public class Addition {
    int a;
    int b;
    int c=a+b;
    void add()
    {
        System.out.println(c);
    }
    void add(int a)
    {
        System.out.println(c);
    }
    void add(int x,int y)
    {
        c=x+y;
        System.out.println(c);
    }
    void display()
    {

    }

    public static void main(String[] args) {
Addition addition=new Addition();

    }


}
