public class Triangle {
    public static void main(String[] args) {
        int a=50;
        int b=90;
        int c=40;
        if ((a+b+c==180) && a>0 && b>0 && c>0) {
            if (a == b && b == c)
                System.out.println("equilateral traingle");
            if ((a != b) || (b != c) || (c != a))
                System.out.println("scalane traingle");
            if ((a == 90) || (b == 90) || (c == 90))
                System.out.println("right angle triangle");
            if ((a == b && b != c) && (b == c && c != a) && (c == a && c != b))
                System.out.println("isoselus trangle");
        }
           else if (a+b+c!=180)
               System.out.println("not a triangle");
        }
    }

