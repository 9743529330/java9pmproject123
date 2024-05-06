package ExceptionHandling;

public class CheckNumber {
    void checkNumber(int i)
    {
        if (i<=10 && i>=1)
        System.out.println("we are safe");
        else
            throw new ArithmeticException("we are in danger");
    }

    public static void main(String[] args) {
        int a=11;
        System.out.println("start of the program");
        System.out.println("a="+a);
        CheckNumber ob=new CheckNumber();
        ob.checkNumber(a);
        System.out.println("checking number");
        System.out.println("end of the program");

    }
}

