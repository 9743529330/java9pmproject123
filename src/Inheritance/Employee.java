package Inheritance;

public class Employee {
    int salary=50000;
    void attendance()
    {
        System.out.println("Attendance");
    }
}
class Programmer extends Employee{
    int bonus=20000;
    void programmerwork()
    {

        System.out.println("programmerwork");
    }

    public static void main(String[] args) {
        Programmer p=new Programmer();
        System.out.println("bonus="+p.bonus);
        p.programmerwork();
        System.out.println("Salary="+p.salary);
        p.attendance();
        Employee ob=new Programmer();
        ob.attendance();//upcasting
    }
}
