package Inheritance;
class superclass {
    superclass()
    {
        System.out.println("superclass");
    }
    int salary = 50000;

    void attendance() {
        System.out.println("attendance");
    }
}

    class subclass extends superclass {
        subclass()
        {
            System.out.println("subclass");
        }
        int salary = 35000;
        int bonus = 15000;

        void attendance() {
            System.out.println("attendance");
        }

        void display() {
            System.out.println("display");
          //  System.out.println("salary="+salary);
        }
    }

    public class TestingSuperclass {
        public static void main(String[] args) {
            subclass ob=new subclass();
            ob.display();

        }
    }

