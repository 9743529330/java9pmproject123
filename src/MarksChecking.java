public class MarksChecking {
    public static void main(String[] args) {
        int marks=106;
        if(marks<=35) {
            System.out.println("fails");
        }
            else if (marks >= 35 && marks < 45) {
                System.out.println("third  class");
            }
            else if (marks >= 45 && marks < 55) {
                System.out.println("second class");
            }
            else if (marks >= 55 && marks < 65) {
                System.out.println("first class");
            }
            else if (marks >= 65 && marks<=100) {
                System.out.println("distinction class");
            } else {
            System.out.println("wrong input");
        }

        }
    }

