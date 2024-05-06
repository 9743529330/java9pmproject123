public class TriangleChecking {
    public static void main(String[] args) {
        int a = -90;
        int b = 180;
        int c =90;
        if (a + b + c ==180 && a>0 && b>0 && c>0)
        {
            if (a == b && b == c)
                System.out.println("triangle is equilateral ");
            if (a == 90 || b == 90 || c == 90)
                System.out.println("triangle is right angled");
            if ((a == b && b != c) || (b == c && c != a) || (c == a && c != b))
                System.out.println("triangle is isoselus");
                if (a != b && b != c && c != a)
                    System.out.println("triangle is scalane");
            } else
                System.out.println("this is not a triangle");
        }
    }

