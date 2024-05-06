public class MethodReturningValues {
    int myMethod() {
        System.out.println("inside this method");
        System.out.println("this method returns the integer type values");
        int a=100;
        return a;
    }

    public static void main(String[] args) {
        MethodReturningValues ob=new MethodReturningValues();
        int x;
        x=20;
        System.out.println(x);
        System.out.println("ob.myMethod->"+ob.myMethod());
        int y=ob.myMethod();
        System.out.println("y="+y);
    }


}

