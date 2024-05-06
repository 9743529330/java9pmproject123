package Inheritance;

public class SuperClass {
    int salary=40000;
    void attendance()
    {
        System.out.println("EmployeeAttendance");
    }
}
class SubClass extends SuperClass {
    int salary = 30000;

    void attendance() {
        System.out.println("childattendance");
    }

void display() {
    System.out.println("display");
    System.out.println(salary);
    attendance();
}

    public static void main(String[] args) {
        SubClass ob=new SubClass();
        ob.display();
        //ob.attendance();


    }
}
