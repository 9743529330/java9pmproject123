public class SplitProgram {
    public static void main(String[] args) {
        String str="this is a java program";
        String[] stArr=str.split(" ");
        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);
        String str1="Hey Baby You Are So lovely";
        String[] stArr1=str1.split("You Are So");
        for (int i=0;i<stArr1.length;i++)
            System.out.println(stArr1[i]);
    }
}
