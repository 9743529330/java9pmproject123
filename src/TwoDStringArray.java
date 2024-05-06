public class TwoDStringArray {
    public static void main(String[] args) {
        String[][] stArr=new String[4][3];
        stArr[0][0]="Rahul";
        stArr[0][1]="Sonu";
        stArr[0][2]="Ramu";
        stArr[1][0]="Amit";
        stArr[1][1]="Somya";
        stArr[1][2]="Janvi";
        stArr[2][0]="Amol";
        stArr[2][1]="Sony";
        stArr[2][2]="Pooja";
        stArr[3][0]="Kanha";
        stArr[3][1]="Tripathi";
        stArr[3][2]="kapoor";
       // for (int i=0;i<4;i++)
       // {
          //  for (int j=0;j<3;j++)
        int row=stArr.length;
        int col=stArr[0].length;
        System.out.println("row= " +row + " col=" +col);
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;j++)
                System.out.print(" "+stArr[i][j]);
            System.out.println();
        }
    }
}
