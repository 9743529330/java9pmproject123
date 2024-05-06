public class FactoCheck20 {
    public static void main(String[] args) {
        int n=10;
        int mult=1;
        for (int i=n;i>=1;i--) {
            mult = mult * i;
        }
        System.out.println("factorial="+mult);

        }
    }
