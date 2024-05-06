package InheritanceDemo.MethodOverloading;

public class Example {
    public void print(int num)
    {
        System.out.println("print="+num);
    }
    public  void print(String text)
    {
        System.out.println("print="+text);
    }
   /* public void display()
    {
        System.out.println("num="+10);
        System.out.println("string="+"mithlesh");
    }*/
    public static void main(String[] args) {
        Example e=new Example();
      e.print(10);  //ovreload the value
      e.print("sony");  //overload the value

    }
}
