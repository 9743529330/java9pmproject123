public class CharArray1 {
    public static void main(String[] args) {
        char[] ch={'a','b','c','d','m','l','h','x','r','w','o'};
        int l=ch.length;
        for (int i=0;i<l;i++)
            System.out.print(" " +ch[i]);
        System.out.println();
        System.out.println("length=" +l);
        for (char mylove:ch)
        System.out.print(" "+mylove);

    }
}
