public class FactorialNo {
    public static void main(String[] args) {
        int n=12;
        int mul=1;
        for (int i=n;i>=1;i--)
            mul=mul*i;
            System.out.println("factorial=" +mul);

    }
}
