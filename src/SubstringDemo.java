public class SubstringDemo {
    public static void main(String[] args) {
        String str1="MITHLESH";
      /*  System.out.println(str1.substring(0)+str1.substring(0,0));
        System.out.println(str1.substring(1)+str1.substring(0,1));
        System.out.println(str1.substring(2)+str1.substring(0,2));
        System.out.println(str1.substring(3)+str1.substring(0,3));
        System.out.println(str1.substring(4)+str1.substring(0,4));
        System.out.println(str1.substring(5)+str1.substring(0,5));
        System.out.println(str1.substring(6)+str1.substring(0,6));
        System.out.println(str1.substring(7)+str1.substring(0,7));*/
        for (int i=0;i<str1.length();i++)
            System.out.println(str1.substring(i)+str1.substring(0,i));

    }
}
