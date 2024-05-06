public class IntArray1 {
    public static void main(String[] args) {
        int[] a={12,25,36,75,89,56,85,96};
        int l=a.length;
        for (int i=0;i<a.length;i++)
            System.out.print(" "+a[i]);
        System.out.println();
       // System.out.println("length="+l);
        System.out.println("length=" +a.length);
        for (int mylove:a)
            System.out.print(" " +mylove);
    }
}
