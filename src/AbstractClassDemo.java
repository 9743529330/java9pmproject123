public abstract class AbstractClassDemo {
    abstract void run();
    abstract int start();
    void display()
    {
        System.out.println("this is display method");
    }

}
class childAbstract extends AbstractClassDemo
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
        AbstractClassDemo ob=new childAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
