public class AdditionPoly {
    int a;
    int b;
    int c=a+b;

    void add(int a,int b)
    {
        int c;
        c=a+b;
        System.out.println("c="+c);

    }
    void add(int a,int b,int c)
    {
        int c1;
        c1=a+b+c;
        System.out.println("c="+c1);
    }
    void add(double d1,double d2)
    {
        double c;
        c=d1+d2;
        System.out.println("c="+c);
    }
    void add(char c1,char c2)
    {
        char c;
        c= (char) (c1+c2); //type casting
        System.out.println("c=" +c);
    }
    void display()
    {
        System.out.println("c= " +c);
    }

    public static void main(String[] args) {
        AdditionPoly ob=new AdditionPoly();
        ob.a=20;
        ob.b=30;
        ob.c=50;
        ob.add(20,40,60);
        ob.add(20,60);
        ob.add('k','k');
        ob.add(23.25,56.56);
        ob.display();
    }
}
