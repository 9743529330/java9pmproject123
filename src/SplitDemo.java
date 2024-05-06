public class SplitDemo {
    public static void main(String[] args) {
        String str="my name is mithlesh yadav";
        String[] stArr=str.split("m");
        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);

        String str1="Hey baby you are so lovely";
       for (int i=0;i<str1.length();i++)
       {
            System.out.println(str1.endsWith("y"));

        }
    }
}
