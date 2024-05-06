public class TwoDStringDemo1 {
    public static void main(String[] args) {
        String[][] stArr = {
                {"Ramesh", "suresh", "Ganesh"},
                {"Azad", "Rampal", "Mohan"},
                {"Sonu", "Raju", "Kapoor"},
        };
        int row = stArr.length;
        int col = stArr[0].length;
        System.out.println("row=" +stArr.length);
        System.out.println("col=" +stArr[0].length);
        for (int i = 0; i < stArr.length; i++)
        {
            for (int j = 0; j < stArr[0].length; j++)
            {

                System.out.print(stArr[i][j]+ " ");
            }
            System.out.println();


        }
    }
}
