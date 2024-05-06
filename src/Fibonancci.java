public class Fibonancci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int sum = 0;
        int n = 10;
        System.out.print(a +"  " +b);  // here ouput because print first and second no itsel print
        for (int i = 3; i <= n; i++) {  // here i=3 given because first and second no also avaible so required of 3rd no itself
            sum = a + b;
            System.out.print("   "  +sum);
            a = b;
            b = sum;
        }
    }
}
