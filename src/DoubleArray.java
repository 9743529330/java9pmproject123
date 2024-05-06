public class DoubleArray {
    public static void main(String[] args) {
        double[] d=new double[5];
        d[0]=11.22;
        d[1]=30.25;
        d[2]=45.25;
        d[3]=85.25;
        d[4]=65.85;
        //for (int i=0;i<5;i++)
        for (double my:d)
        System.out.println(my);
    }
}
