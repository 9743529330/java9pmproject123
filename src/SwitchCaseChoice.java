public class SwitchCaseChoice {
    public static void main(String[] args) {
        int a=50;
        int b=10;
        int c;
        String choice="ml";
        switch (choice)
        {
            case "add":c=a+b;
            System.out.println("addition=" +c);
            break;
            case "sub":c=a-b;
            System.out.println("substraction=" +c);
            break;
            case "mul":c=a*b;
            System.out.println("multiplication=" +c);
            break;
            case  "div":c=a/b;
            System.out.println("division=" +c);
            break;
            default:
                System.out.println("wrong choice");
                break;
        }
    }
}
