package Inheritance;

public class Bird {
    void fly()
    {
        System.out.println("fly");
    }
}
class Sparrow extends Bird{
    void sparrocolor()
    {
        System.out.println("sparrowcolor");
        System.out.println("fly");
    }
}
class Crow extends Bird{
    void crowcolor()
    {
        System.out.println("crowcolor");
        System.out.println("fly");
    }

    public static void main(String[] args) {
        Bird b=new Bird();
        b.fly();
        Sparrow s=new Sparrow();
        s.sparrocolor();
        s.fly();
        Crow c=new Crow();
        c.crowcolor();
        c.fly();
    }
}

