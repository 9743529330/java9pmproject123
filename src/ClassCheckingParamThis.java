public class ClassCheckingParamThis {
    int a;
    double d;
    char c;
    String str;
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);

    }
    ClassCheckingParamThis(int a, double d, char c, String str)
    {

      this. a=a; // it is a parameterized constructor
       this.d=d;
       this.c= c;
        this.str="str";

    }

    public static void main(String[] args) {
        ClassCheckingParamThis ob=new ClassCheckingParamThis(56,53.23,'k',"azad");
        ob.display();


    }
}
