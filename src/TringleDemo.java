public class TringleDemo {
    public static void main(String[] args) {
        int a=55;
        int b=70;
        int c=55;
        if (a+b+c==180 && a>0 && b>0 && c>0) {
            if (a == b && b == c)
                System.out.println("equilateral triangle");
            if (a != b && b != c && c != a)
                System.out.println("scalene triangle");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("right angled triangle");
            if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                System.out.println("isoselus triangle");
        }else {
            System.out.println("this is not a triangle");
        }
    }
}
