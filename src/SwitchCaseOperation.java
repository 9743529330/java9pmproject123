public class SwitchCaseOperation {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        int c;
        String operation="guna";
        switch (operation)
        {
            case "add":c=a+b;
            System.out.println("addition=" +c);
            break;
            case "sub":c=a-b;
            System.out.println("subtraction=" +c);
            break;
            case "mult":c=a*b;
            System.out.println("multiplication=" +c);
            break;
            case "div":c=a/b;
            System.out.println("division=" +c);
            break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
