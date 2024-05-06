public class TwoDDoubleArray {
    public static void main(String[] args) {
        double [][] d=new double[4][3];
        d[0][0]=35.49;
        d[0][1]=46.39;
        d[0][2]=12.36;
        d[1][0]=16.39;
        d[1][1]=46.46;
        d[1][2]=40.46;
        d[2][0]=19.69;
        d[2][1]=42.36;
        d[2][2]=12.40;
        d[3][0]=15.16;
        d[3][1]=10.20;
        d[3][2]=11.22;
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
                System.out.print(" "+d[i][j]);
            System.out.println();
        }
    }
}
