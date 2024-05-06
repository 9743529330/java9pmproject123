public class StringArray1 {
    public static void main(String[] args) {
        String[] stArr={"amit","rahul","sunil","kapoor","mamta","geeta","anjali","rausan","anand","prakash","mohit"};
        int l=stArr.length;
        for (int i=0;i<l;i++)
            System.out.print(" " +stArr[i]);
        System.out.println();
        System.out.println("length=" +stArr.length);
        for (String mylove:stArr)
        System.out.print(" " +mylove);
    }
}
