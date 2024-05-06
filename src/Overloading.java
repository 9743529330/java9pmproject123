public class Overloading {
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    void sum(int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    void display()
    {

    }

    public static void main(String[] args) {
        Overloading ob=new Overloading();
        ob.sum(10,20);
        ob.sum(20,30,40);
        ob.display();




    }
}
