package Abstraction;

public abstract class AbstractClassDemo {
    abstract void run();
    abstract int Start();
    void display()
    {
        System.out.println("this is display method");
    }
}
 abstract class ChildAbstract extends AbstractClassDemo
{
    void run()
    {
        System.out.println("run");
    }
    int start()
    {
        int a=20;
        System.out.println("started at a=" +a);
        return a;
    }

    public static void main(String[] args) {
        AbstractClassDemo ob= new ChildAbstract() {
            @Override
            int Start() {
                return 0;
            }
        };
        ob.run();
        ob.Start();
        ob.display();
    }
}
