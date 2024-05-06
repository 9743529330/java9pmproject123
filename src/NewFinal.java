import javax.lang.model.element.VariableElement;

public class NewFinal {
    final int speed=200;
   // final void change()
    {
     //  final speed=300;

    }

    public static void main(String[] args) {
        NewFinal ob=new NewFinal();
       // ob.change();
        System.out.println(ob.speed);
    }
}
