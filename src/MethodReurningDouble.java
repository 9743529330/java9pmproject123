public class MethodReurningDouble {
    double myMethod()
    {
        System.out.println("inside this my method");
        System.out.println("this method returns double type of values");
        double x=200;
        return x;
    }

    public static void main(String[] args) {
        MethodReurningDouble mithlesh=new MethodReurningDouble();
        double y;
        y=50;
        System.out.println("y="+y);
        System.out.println("mithlesh.myMethod()->"+mithlesh.myMethod());
        double z= mithlesh.myMethod();
        System.out.println("z="+z);

    }
}
