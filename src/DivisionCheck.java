public class DivisionCheck {
    public static void main(String[] args) {
        // int i=1;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + "fizzBuzz");
            else if (i % 3 == 0)
                System.out.println(i + "fizz");
            else if (i % 5 == 0)
                System.out.println(i + "Buzz");
            else {
                System.out.println(i);
            }
        }
    }
}
