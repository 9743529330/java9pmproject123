public class TwoDCharArray {
    public static void main(String[] args) {
        char[][] ch=new char[4][3];
        ch[0][0]='R';
        ch[0][1]='A';
        ch[0][2]='M';
        ch[1][0]='S';
        ch[1][1]='U';
        ch[1][2]='N';
        ch[2][0]='M';
        ch[2][1]='A';
        ch[2][2]='N';
        ch[3][0]='S';
        ch[3][1]='O';
        ch[3][2]='N';
        for (int i=0;i<4;i++)
        {
            for (int j=0;j<3;j++)
                System.out.print(" "+ch[i][j]);
            System.out.println();
        }
    }
}
