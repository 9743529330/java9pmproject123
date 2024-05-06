public class TwoDArrayNew {
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        a[0][0] = 56;
        a[0][1] = 96;
        a[0][2] = 76;
        a[0][3] = 36;

        a[1][0] = 57;
        a[1][1] = 93;
        a[1][2] = 78;
        a[1][3] = 56;

        a[2][0] = 51;
        a[2][1] = 94;
        a[2][2] = 74;
        a[2][3] = 30;

        a[3][0] = 41;
        a[3][1] = 64;
        a[3][2] = 54;
        a[3][3] = 30;
        int row = a.length;
        int col = a[0].length;
        System.out.println("row="+ a.length);
        System.out.println("colomn="+ a[0].length);

        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + "  ");
            }
                System.out.println();
            }
        }
    }
