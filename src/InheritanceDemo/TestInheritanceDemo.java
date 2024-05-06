package InheritanceDemo;
class Superclass {
    int salary = 20000;
    void attendance() {
        System.out.println("Emplyee attandance");
    }
}

    class subclass extends Superclass
    {
        int salary = 30000;
        int bonus = 10000;

        void attendance() {

            System.out.println("programmer attendance");
        }


        void dispaly() {
            System.out.println("display");
            System.out.println("salary=" + super.salary);System.out.println("bonus="+bonus);
            super.attendance();


        }
    }

    public class TestInheritanceDemo {
        public static void main(String[] args) {

            subclass subclass = new subclass();
            subclass.dispaly();

        }
    }








