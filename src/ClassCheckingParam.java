public class ClassCheckingParam {
    int a;
    double d;
    char c;
    String str;
    ClassCheckingParam(int a1,double d1,char c1,String str1)
    {

        a=a1; // it is a parameterized constructor
        d=d1;
        c= c1;
        str="str1";

    }
    void display()
    {
        System.out.println("a="+a);
        System.out.println("d="+d);
        System.out.println("c="+c);
        System.out.println("str="+str);

    }


    public static void main(String[] args) {
        ClassCheckingParam ob=new ClassCheckingParam(56,53.23,'k',"azad");
        ob.display();


    }
}
