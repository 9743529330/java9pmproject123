package StaticAndFinal;

public class Student {
    int rno;
    String name;
   static String college="pune college";
    void display()
    {
        System.out.println("rno="+rno);
        System.out.println("name="+name);
        System.out.println("college="+college);
    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.rno=111;
        s1.name="mohan";

        s2.rno=222;
        s2.name="shyam";

       s3.rno=333;
       s3.name="saryodya";
        s3.college="NIET";

        s1.display();
        s2.display();
        s3.display();

    }
}
