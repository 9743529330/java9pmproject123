public class DoubleArrayCheck {
    public static void main(String[] args) {
        double[] d=new double[10];
        d[0]=11.56;
        d[1]=21.56;
        d[2]=31.56;
        d[3]=41.56;
        d[4]=51.56;
        d[5]=61.56;
        d[6]=71.56;
        d[7]=81.56;
        d[8]=91.56;
        d[9]=11.86;
      //  for (int i=0;i<10;i++) //print all the element using of for loop
          //  System.out.println(d[5]);
            for (double z:d)// another method using for each loop print all the element
       // System.out.println(d[i]);
                System.out.println(z);




    }
}
