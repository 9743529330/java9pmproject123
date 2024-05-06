public class InheritanceDemo {
        int salary=50000;
        void attandance()
        {
            System.out.println("attandance");
        }
    }
      class programmer extends InheritanceDemo{
        int bonus=15000;
        void programmerwork()
        {
            System.out.println("programmerwork");
        }
    public static void main(String[] args) {
        programmer p=new programmer();
        p.programmerwork();
        System.out.println("salary=" +p.salary);
        System.out.println("bonus="+p.bonus);
        p.attandance();
    }
}

