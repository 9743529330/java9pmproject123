package InheritancePlan;

public class Animal {
    void eat()
    {
        System.out.println("eat");
    }
  public static   class Dog extends Animal{
        void bark()
        {
            System.out.println("bark");
            System.out.println("eat");

        }
     public   static class Babydog extends Dog{
            void weep()
            {
                System.out.println("weep");
                System.out.println("bark");
                System.out.println("eat");

            }
        }


    public static void main(String[] args) {
        Animal a=new Animal();
        a.eat();
        Dog d=new Dog();
        d.bark();
        d.bark();
        Dog.Babydog bd=new Dog.Babydog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
}
