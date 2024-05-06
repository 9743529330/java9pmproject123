package InheritanceDemo.MethodOverloading.MethodOverriding;

public class Animal {
    public void makesound()
    {
        System.out.println("animal makes a sound");
    }

    public static class Dog extends Animal
    {
        @Override
        public void makesound()
        {
            System.out.println("dog barks");
        }

        public static void main(String[] args) {
            Animal a=new Animal();
            a.makesound();
            Dog d=new Dog();
           d.makesound();

        }
    }
}
