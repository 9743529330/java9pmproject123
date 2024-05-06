public class DoubleArray1 {
    public static void main(String[] args) {
        double[] d={12.39,14.36,15.36,19.37,20.36,36.72,16.62,19.72,65.72,16.19,15.16};
        int l=d.length;
        for (int i=0;i<l;i++)
            System.out.print(" " +d[i]);
        System.out.println();
        System.out.println("length=" +d.length);
        for (double mylove:d)
            System.out.print(" "+mylove);

    }
}
