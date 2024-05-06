package ExceptionHandling;

public class ArrayDemo {
    public static void main(String[] args) {
        int []a=new int[5];
      //  try {
            a[0]=56;
            a[1]=49;
            a[2]=29;
            a[3]=39;
            a[4]=59;
           // a[5]=99;
      //  }
        //catch (Exception e)
        {
            System.out.println("inside catch");
        }
       // for (int i=0;i<5;i++)  //a.length count the total length of index
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
