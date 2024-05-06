public class SwitchOperation {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        int c;
        String choice = "pow";
        switch (choice) {
            case "add":
                c = a + b;
                System.out.println("Addition=" + c);
                break;
            case "sub":
                c = a - b;
                System.out.println("Substraction=" + c);
                break;
            case "mul":
                c = a * b;

                System.out.println("Multiplication=" + c);
                break;
            case "div":
                c = a /b;
                System.out.println("Division=" + c);
                break;
            case "per":
                c = (a % b);
                System.out.println("Percentage=" + c);
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
