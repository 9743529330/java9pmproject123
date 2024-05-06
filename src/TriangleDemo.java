public class TriangleDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;
        if ((a+b+c==180) && a > 0 && b > 0 && c > 0){
            if (a == b && b == c)
                System.out.println("equilateral triangle");
                if (a == 90 || b == 90 || c == 90)
                    System.out.println("right angled triangle");
                if ((a == b && b != c) || (b == c && c != a) || (c == a && a != b))
                    System.out.println("isocelus triangle");
                if (a != b && b != c && c != a)
                    System.out.println("scalene triangle");
            } else
                System.out.println("this is not a triangle");
            }
    }



