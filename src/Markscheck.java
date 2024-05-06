public class Markscheck {
    public static void main(String[] args) {
        int marks=110;
        if (marks<35 )
            System.out.println("fail");
        else if (marks>=35 && marks<50)
            System.out.println("pass");
        else if (marks>=50 && marks<60)
            System.out.println("second class");
        else if (marks>=60 && marks<70)
            System.out.println("first class");
        else if (marks>=70 && marks<=100)
            System.out.println("distiction class");
        else {
            System.out.println("invalid input");
        }


    }
}
