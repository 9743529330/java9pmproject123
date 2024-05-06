package Inheritance;

public class HybridInheritance {
    void eat()
    {
        System.out.println("eat");
    }
}
class Mamal extends HybridInheritance{
    void walk()
    {
        System.out.println("walk");
        System.out.println("eat");
    }
}
class Tiger extends Mamal{
    void roar()
    {
        System.out.println("roar");
        System.out.println("walk");
        System.out.println("eat");
    }
}
class Reptile extends HybridInheritance{
    void crow()
    {
        System.out.println("crow");
        System.out.println("eat");
    }

    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        Mamal m=new Mamal();
        m.walk();
        m.eat();
        Tiger t=new Tiger();
        t.roar();
        t.walk();
        t.eat();
        Reptile r=new Reptile();
        r.crow();
        r.eat();

    }
}
