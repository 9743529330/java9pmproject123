public class SplitDemo1 {
    public static void main(String[] args) {
        String str="Hey Baby You Are So Lovely";
        String[] stArr=str.split(" ");
        for (int i=0;i<stArr.length;i++){
            String temp=stArr[i];
            int l=temp.length();
            if (temp.charAt(l-1)=='y')
                System.out.println(stArr[i]);

        }
    }
}
