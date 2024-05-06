public class TwoDIntArray {
    public static void main(String[] args) {
        int[][] a=new int[4][3];
        a[0][0]=25;
        a[0][1]=65;
        a[0][2]=98;
        a[1][0]=56;
        a[1][1]=63;
        a[1][2]=89;
        a[2][0]=56;
        a[2][1]=36;
        a[2][2]=96;
        a[3][0]=12;
        a[3][1]=58;
        a[3][2]=45;
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
                System.out.print(" "+a[i][j]);
            System.out.println();

        }
    }
}
