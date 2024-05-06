public class SplitDemo3 {
    public static void main(String[] args) {
        String str="Hey Baby You Are So lovely";
        String[] stArr=str.split("You Are So ");
        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);//print the string ends with y
        System.out.println();
    }
}
