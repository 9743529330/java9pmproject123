public class New {

        float f1=10.25f;
        float f2=25.25f;
        float f3=f1+f2;
        void display()
        {
            System.out.println("float f1 ="+f1);
            System.out.println("float f2 =" +f2);
            System.out.println("float f3= " +f3);

        }
    public static void main(String[] args) {
            New ob=new New();
            //ob.f3=25.25f;
           // ob.f1=35.25f;
           // ob.f2=56.25f;
            ob.display();



    }

}
